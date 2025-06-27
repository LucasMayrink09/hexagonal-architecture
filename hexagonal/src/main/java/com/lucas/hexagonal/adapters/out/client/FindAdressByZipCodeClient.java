package com.lucas.hexagonal.adapters.out.client;

import com.lucas.hexagonal.adapters.out.client.response.AddressResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(
        name =  "FindAdressByZipCodeClient",
        url = "${lucas,client.adress.url}"
)
public interface FindAdressByZipCodeClient {

    @GetMapping("/{zipCode}")
    AddressResponse find(@PathVariable("zipCode") String zipCode);
}
