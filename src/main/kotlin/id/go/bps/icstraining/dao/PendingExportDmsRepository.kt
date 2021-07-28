package id.go.bps.icstraining.dao

import id.go.bps.icstraining.entity.PendingExportDms
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface PendingExportDmsRepository : JpaRepository<PendingExportDms, String>