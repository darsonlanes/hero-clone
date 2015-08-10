package com.heroclone.api.config;
/*package com.heroclone.api.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled=true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    NDUSActiveDirectoryLdapAuthenticationProvider adProvider;
    
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            .authorizeRequests()
                .antMatchers("/api/hello**").permitAll()
                .antMatchers("/**").hasRole("USER")
                .and()
            .formLogin();
    }
    
    @Bean
    public NDUSActiveDirectoryLdapAuthenticationProvider adAuthenticationProvider() {
        NDUSActiveDirectoryLdapAuthenticationProvider adLdap = new
                NDUSActiveDirectoryLdapAuthenticationProvider(
                        "ad.ndus.edu",
                        "ldaps://NDUSDC1.ad.ndus.edu:636"
                );
        adLdap.setConvertSubErrorCodesToExceptions(true);
        return adLdap;
    }

    @Override
    @Autowired
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        
        //auth.authenticationProvider(adAuthenticationProvider());
    }
}

*/