package demo

import spock.lang.Specification

class HelperServiceSpec extends Specification {

    void "test partial mock"() {
        setup:
        def svc = Spy(HelperService) {
            retrieveMultiplier() >> 10
        }

        expect:
        svc.mulitplyNumber(4) == 40
    }
}
