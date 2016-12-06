/**
 *
 */
package com.ebookb2b.core.comingsoon.dao;

import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.internal.dao.AbstractItemDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.impl.SearchResultImpl;

import java.util.List;


/**
 * @author raghared
 *
 */
public class ComingSoonDao extends AbstractItemDao
{
	public List<ProductModel> findcomingsoonproduct()

	{

		final String queryString = new StringBuilder("SELECT {PK} FROM {Product} where {COMINGSOON}= true").toString();
		final FlexibleSearchQuery query = new FlexibleSearchQuery(queryString);
		final SearchResultImpl searchResult = (SearchResultImpl) flexibleSearchService.search(query);
		final List<ProductModel> productList = searchResult.getResult();
		return productList;
	}
}
