package com.example.BeanSopesSessionRequest;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ScopeTestController {

    private final MyRequestBean requestBean;
    private final MySessionBean sessionBean;

    public ScopeTestController(MyRequestBean requestBean, MySessionBean sessionBean) {
        this.requestBean = requestBean;
        this.sessionBean = sessionBean;
    }

    @GetMapping("/scope-test")
    public String testScopes() {
        return """
            Request Bean HashCode: %d<br>
            Request Counter: %d<br>
            <br>
            Session Bean HashCode: %d<br>
            Session Counter: %d
            """.formatted(
                requestBean.hashCode(),
                requestBean.increment(),
                sessionBean.hashCode(),
                sessionBean.increment()
            );
    }
}
