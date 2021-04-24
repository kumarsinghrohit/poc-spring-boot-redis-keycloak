package com.demo;

//
//@Configuration
//@EnableWebSecurity
//@ComponentScan(basePackageClasses = KeycloakSecurityComponents.class)
public class SecurityConfiguration {
//extends KeycloakWebSecurityConfigurerAdapter {
	/**
	 * 
	 * Registers the KeycloakAuthenticationProvider with the authentication manager.
	 */
//	@Autowired
//	public void configureGlobal(AuthenticationManagerBuilder auth) {
//		KeycloakAuthenticationProvider keycloakAuthenticationProvider = keycloakAuthenticationProvider();
//		SimpleAuthorityMapper authorityMapper = new SimpleAuthorityMapper();
//		// authorityMapper.setConvertToUpperCase(true);
//		// keycloakAuthenticationProvider.setGrantedAuthoritiesMapper(authorityMapper);
//		// auth.authenticationProvider(keycloakAuthenticationProvider()); }
//	}
//
//	/**
//	 * 
//	 * Defines the session authentication strategy.
//	 */
//	@Bean
//	@Override
//	protected SessionAuthenticationStrategy sessionAuthenticationStrategy() {
//		return new NullAuthenticatedSessionStrategy();
//	}
//
//	@Override
//	protected void configure(HttpSecurity http) throws Exception
//
//	{
//		super.configure(http);
//		http.authorizeRequests().anyRequest().authenticated();
//	}
//
//	@Bean
//	@LoadBalanced
//	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//	public KeycloakRestTemplate keycloakRestTemplate(KeycloakClientRequestFactory keycloakClientRequestFactory)
//
//	{
//		return new KeycloakRestTemplate(keycloakClientRequestFactory);
//	}
//
//	@Bean
//	public KeycloakConfigResolver KeycloakConfigResolver()
//
//	{
//		return new KeycloakSpringBootConfigResolver();
//	}
//
//	@Bean
//	public FilterRegistrationBean<KeycloakAuthenticationProcessingFilter> keycloakAuthenticationProcessingFilterRegistrationBean(
//			KeycloakAuthenticationProcessingFilter filter)
//
//	{
//		FilterRegistrationBean<KeycloakAuthenticationProcessingFilter> registrationBean = new FilterRegistrationBean<>(
//				filter);
//		registrationBean.setEnabled(false);
//		return registrationBean;
//	}
//
//	@Bean
//	public FilterRegistrationBean<KeycloakPreAuthActionsFilter> keycloakPreAuthActionsFilterRegistrationBean(
//			KeycloakPreAuthActionsFilter filter)
//
//	{
//		FilterRegistrationBean<KeycloakPreAuthActionsFilter> registrationBean = new FilterRegistrationBean<>(filter);
//		registrationBean.setEnabled(false);
//		return registrationBean;
//	}
//
//	@Bean
//	public FilterRegistrationBean<KeycloakAuthenticatedActionsFilter> keycloakAuthenticatedActionsFilterBean(
//			KeycloakAuthenticatedActionsFilter filter)
//
//	{
//		FilterRegistrationBean<KeycloakAuthenticatedActionsFilter> registrationBean = new FilterRegistrationBean<>(
//				filter);
//		registrationBean.setEnabled(false);
//		return registrationBean;
//	}
//
//	@Bean
//	public FilterRegistrationBean<KeycloakSecurityContextRequestFilter> keycloakSecurityContextRequestFilterBean(
//			KeycloakSecurityContextRequestFilter filter)
//
//	{
//		FilterRegistrationBean<KeycloakSecurityContextRequestFilter> registrationBean = new FilterRegistrationBean<>(
//				filter);
//		registrationBean.setEnabled(false);
//		return registrationBean;
//	}
//
//	@Bean
//	@Override
//	@ConditionalOnMissingBean(HttpSessionManager.class)
//	protected HttpSessionManager httpSessionManager()
//
//	{
//		return new HttpSessionManager();
//	}
}