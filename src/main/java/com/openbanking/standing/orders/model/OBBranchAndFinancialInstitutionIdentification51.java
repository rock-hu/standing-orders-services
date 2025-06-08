package com.openbanking.standing.orders.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 * Party that manages the account on behalf of the account owner, that is manages the registration and booking of
 * entries on the account, calculates balances on the account and provides information about the account. This is the
 * servicer of the beneficiary account.
 */

@Schema(
		description = "Party that manages the account on behalf of the account owner, that is manages the registration and booking of entries on the account, calculates balances on the account and provides information about the account. This is the servicer of the beneficiary account.")
@Getter
@Setter
public class OBBranchAndFinancialInstitutionIdentification51 implements Serializable {
	private static final long serialVersionUID = 1L;

}
