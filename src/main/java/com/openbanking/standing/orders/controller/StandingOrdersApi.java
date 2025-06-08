package com.openbanking.standing.orders.controller;

import com.openbanking.standing.orders.model.OBReadStandingOrder6;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Tag(name = "standing-orders", description = "standing-orders")
@RequestMapping(value = "")
public interface StandingOrdersApi {

	@Operation(summary = "Get Standing Orders", operationId = "getStandingOrders", description = "", tags = { "Standing Orders", })

	@RequestMapping(
			value = "/standing-orders",
			produces = { "application/json; charset=utf-8", "application/json", "application/jose+jwe" },
			method = RequestMethod.GET)
	default ResponseEntity<OBReadStandingOrder6> getStandingOrders(
			@Parameter(name = "An Authorisation Token as per https://tools.ietf.org/html/rfc6750", required = true)
			@RequestHeader(value = "Authorization", required = true)
			String authorization, @Parameter(
					name = "The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC")
			@RequestHeader(value = "x-fapi-auth-date", required = false)
			String xFapiAuthDate, @Parameter(name = "The PSU's IP address if the PSU is currently logged in with the TPP.")
			@RequestHeader(value = "x-fapi-customer-ip-address", required = false)
			String xFapiCustomerIpAddress, @Parameter(name = "An RFC4122 UID used as a correlation id.")
			@RequestHeader(value = "x-fapi-interaction-id", required = false)
			String xFapiInteractionId, @Parameter(name = "Indicates the user-agent that the PSU is using.")
			@RequestHeader(value = "x-customer-user-agent", required = false)
			String xCustomerUserAgent) {
		return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
	}

}
