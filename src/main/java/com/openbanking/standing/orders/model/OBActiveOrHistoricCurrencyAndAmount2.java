package com.openbanking.standing.orders.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 * The amount of the first Standing Order
 */

@Schema(description = "The amount of the first Standing Order")
@Getter
@Setter
public class OBActiveOrHistoricCurrencyAndAmount2 implements Serializable {
	private static final long serialVersionUID = 1L;

}
