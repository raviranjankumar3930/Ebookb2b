/**
 *
 */
package com.ebookb2b.core.model;

import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.servicelayer.model.attribute.DynamicAttributeHandler;


/**
 * @author ravirpan
 *
 */
public class DynamicHybrisCustomerAttributeBean implements DynamicAttributeHandler<Boolean, CustomerModel>
{
	@Override
	public Boolean get(final CustomerModel model)
	{
		if (model == null)
		{
			throw new IllegalArgumentException("Item model is required");
		}

		// Accelerator stores the email in the ID (uid) field
		final String email = model.getUid();
		return Boolean.valueOf(email != null && (email.endsWith("hybris.de") || email.endsWith("hybris.com")));

	}

	@Override
	public void set(final CustomerModel model, final Boolean value)
	{
		//throw new UnsupportedOperationException("Not supported yet.");
	}
}
