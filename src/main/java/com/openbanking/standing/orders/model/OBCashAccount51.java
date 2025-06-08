package com.openbanking.standing.orders.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 * Provides the details to identify the beneficiary account.
 */

@Schema(description = "Provides the details to identify the beneficiary account.")
@Getter
@Setter
public class OBCashAccount51 implements Serializable {
	private static final long serialVersionUID = 1L;

}
