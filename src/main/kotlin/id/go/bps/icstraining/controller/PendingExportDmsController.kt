package id.go.bps.icstraining.controller

import id.go.bps.icstraining.entity.PendingExportDms
import id.go.bps.icstraining.service.PendingExportDmsService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class PendingExportDmsController(private val pendingExportDmsService: PendingExportDmsService){
    @GetMapping("/pending-export-dms")
    fun getAllPendingExportDms(): List<PendingExportDms> = pendingExportDmsService.getAllPendingExportDms()

    @PostMapping("/pending-export-dms")
    fun createPendingExportDms(@RequestBody payload: PendingExportDms): PendingExportDms {
        return pendingExportDmsService.createPendingExportDms(payload)
    }

//    @PostMapping("/pending-export-dms2")
//    fun createPendingExportDms2(@RequestBody payload: PendingExportDms): PendingExportDms {
//        return pendingExportDmsService.createPendingExportDms(payload)
//    }
//
//    @PostMapping("/pending-export-dms3")
//    fun createPendingExportDms3(): String? {
//        return "OKE...."
//    }
}