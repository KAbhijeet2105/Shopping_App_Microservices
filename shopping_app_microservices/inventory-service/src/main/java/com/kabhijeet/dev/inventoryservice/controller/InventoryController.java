package com.kabhijeet.dev.inventoryservice.controller;


import com.kabhijeet.dev.inventoryservice.dto.InventoryResponse;
import com.kabhijeet.dev.inventoryservice.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/inventory")
@RequiredArgsConstructor
public class InventoryController {

    private final InventoryService inventoryService;

    //example requests
    /*
    *  http://localhost:8082/api/inventory/iphone-13,iphone13-red   //request with path variables
    *
    * http://localhost:8082/api/inventory?skuCode=iphone-13&skuCode=iphone13-red  //request with request param
    *
    * */

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<InventoryResponse> isInStock(@RequestParam List<String> skuCode){
        return inventoryService.isInStock(skuCode);
    }
}
