package com.example.co_templates.restapis;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommonCodeController {
    // /commonCode/1/10/1
    @GetMapping("/r/commonCode/list/{page_num}")
    public ResponseEntity<Object> List(@PathVariable String page_num) {

        ArrayList arrayList = new ArrayList<>();
        HashMap resultMap = new HashMap<>();
        
        resultMap.put("PK_ID", "CAR_01");
        resultMap.put("FK_ID", "OPTION_01");
        resultMap.put("NAME", "블랙박스");
        
        arrayList.add(resultMap);

        return ResponseEntity.ok().body(arrayList);
    }

    @GetMapping("/r/commonCode/view/{currentPage}/{perPage}/{page_num}")
    public ResponseEntity<Object> view(@PathVariable String currentPage, @PathVariable String perPage,
            @PathVariable String page_num) {

        ArrayList arrayList = new ArrayList<>();
        HashMap resultMap = new HashMap<>();
        resultMap = new HashMap<>();
        resultMap.put("PK_ID", "CAR_02");
        resultMap.put("FK_ID", "OPTION_02");
        resultMap.put("NAME", "핸들");
        arrayList.add(resultMap);

        return ResponseEntity.ok().body(arrayList);
    }
}


