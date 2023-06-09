package com.example.shop_recruitment;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import org.springframework.context.annotation.Configuration;

@Configuration
@SecurityScheme(name = "basicAuth", scheme = "basic", type = SecuritySchemeType.HTTP, in = SecuritySchemeIn.HEADER, description = """
        There are two predefined users with different resource entitlements based on challenge description.
        
        Credentials for:
        
           admin: {admin:password}
        
           customer: {customer:password}""")
@OpenAPIDefinition(
        info = @Info(title = "Shop API", version = "v1"),
        security = @SecurityRequirement(name = "basicAuth")
)
public class OpenAPIConfiguration {
}
