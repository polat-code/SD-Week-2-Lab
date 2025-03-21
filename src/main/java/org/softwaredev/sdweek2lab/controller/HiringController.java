package org.softwaredev.sdweek2lab.controller;

import org.softwaredev.sdweek2lab.request.HiringRequest;
import org.softwaredev.sdweek2lab.services.HiringManager;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/hiring")
public class HiringController {

    private final HiringManager hiringManager;
   public HiringController(HiringManager hiringManager) {
       this.hiringManager = hiringManager;
   }
    @PostMapping("/hire")
    public String hiring(@RequestBody HiringRequest hiringRequest) {
        return hiringManager.hireBook(hiringRequest);
    }
}
