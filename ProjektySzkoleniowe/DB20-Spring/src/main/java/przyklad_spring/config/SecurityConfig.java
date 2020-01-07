package przyklad_spring.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("admin").password("{noop}abc123").roles("USER", "ADMIN");
		
//        auth.jdbcAuthentication()
//        .dataSource(dataSource)
//        .passwordEncoder(passwordEncoder())
//        .usersByUsernameQuery("SELECT username, password, true FROM users WHERE username = ?")
//        .authoritiesByUsernameQuery("SELECT username, 'ROLE_USER' FROM users WHERE username = ?");

	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
	    http.authorizeRequests()
           .antMatchers("/", "/hello", "/register", "/login").anonymous()
           .anyRequest().authenticated()
           .and()
       .formLogin()
           .loginPage("/login")
           .defaultSuccessUrl("/")
           .and()
       .logout()
           .logoutUrl("/logout")
           .logoutSuccessUrl("/")
           .and()
       .csrf().disable();
	}
	
	
}
