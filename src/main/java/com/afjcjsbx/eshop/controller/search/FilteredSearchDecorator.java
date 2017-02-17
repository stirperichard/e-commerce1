package com.afjcjsbx.eshop.controller.search;

import com.afjcjsbx.eshop.entity.catalogue.Product;

import java.sql.SQLException;
import java.util.ArrayList;

public abstract class FilteredSearchDecorator extends FilteredSearchController {

    private FilteredSearchController filteredSearch;

    public FilteredSearchDecorator(FilteredSearchController filteredSearch) {
        this.filteredSearch = filteredSearch;
    }

    @Override
    public ArrayList<Product> search(String search) throws SQLException {
        return filteredSearch.search(search);
    }
}
