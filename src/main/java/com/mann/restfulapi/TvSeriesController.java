package com.mann.restfulapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;


@RestController
@RequestMapping("/tvseries")
public class TvSeriesController {

    @GetMapping
    public List<TvSeriesDTO> getAll(){
        List<TvSeriesDTO> list = new ArrayList<>();
        Calendar calendar = Calendar.getInstance();
        calendar.set(2016,3-1,16,0,0);
        list.add(new TvSeriesDTO(1,"西部大解放",1,calendar.getTime()));
        return list;

    }
}
