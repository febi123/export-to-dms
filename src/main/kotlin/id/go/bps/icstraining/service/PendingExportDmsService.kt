package id.go.bps.icstraining.service

import id.go.bps.icstraining.dao.PendingExportDmsRepository
import id.go.bps.icstraining.entity.PendingExportDms
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class PendingExportDmsService(private val pendingExportDmsRepository: PendingExportDmsRepository){

    fun createPendingExportDms(pendingExportDms: PendingExportDms) : PendingExportDms {
      return pendingExportDmsRepository.save(pendingExportDms)
    }

    fun getAllPendingExportDms(): List<PendingExportDms>{
        return pendingExportDmsRepository.findAll()
    }
}