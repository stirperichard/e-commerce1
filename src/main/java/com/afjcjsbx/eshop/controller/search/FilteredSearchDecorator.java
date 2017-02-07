package com.afjcjsbx.eshop.controller.search;

import com.afjcjsbx.eshop.entity.catalog.Product;

import java.sql.SQLException;
import java.util.ArrayList;

public abstract class FilteredSearchDecorator extends FilteredSearchController {

    private FilteredSearchController filteredSearch;

    public FilteredSearchDecorator(FilteredSearchController filteredSearch) {
        this.filteredSearch = filteredSearch;
    }

    @Override
    public ArrayList<Product> search() throws SQLException {
        return filteredSearch.search();
    }
}
