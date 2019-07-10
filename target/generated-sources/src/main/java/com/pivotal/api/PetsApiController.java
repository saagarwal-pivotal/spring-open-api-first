package com.pivotal.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-07-10T16:10:41.727-04:00[America/New_York]")

@Controller
@RequestMapping("${openapi.swaggerPetstore.base-path:/v1}")
public class PetsApiController implements PetsApi {

    private final PetsApiDelegate delegate;

    public PetsApiController(@org.springframework.beans.factory.annotation.Autowired(required = false) PetsApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new PetsApiDelegate() {});
    }

    @Override
    public PetsApiDelegate getDelegate() {
        return delegate;
    }

}
