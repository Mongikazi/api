package com.momentum.api.controllers;

import com.momentum.api.models.Purchase;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Api(value = "PurchaseController", description = "Purchase Controller REST API Methods")
@RestController
public class PurchaseController {

    List<Purchase> purchases = new ArrayList<Purchase>();
    {
        purchases.add(new Purchase("Sajal", null,null));
        purchases.add(new Purchase("Lokesh", null,null));
    }

    @ApiOperation(value = "Get list of Purchases in the System ", response = Iterable.class, tags = "purchases")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "SUCCESS!"),
            @ApiResponse(code = 401, message = "NOT AUTHORIZED!"),
            @ApiResponse(code = 403, message = "FORBIDDEN!"),
            @ApiResponse(code = 404, message = "NOT FOUND!") })

    @RequestMapping(value = "/purchases")
    public List<Purchase> getPurchases() {
        return purchases;
    }

    @ApiOperation(value = "Get specific Purchase in the System ", response = Purchase.class, tags = "purchase")
    @RequestMapping(value = "/purchase/{id}")
    public Purchase getPurchase(@PathVariable(value = "id") String id) {
        return purchases.stream().filter(x -> x.getId().equalsIgnoreCase(id)).collect(Collectors.toList()).get(0);
    }
}
