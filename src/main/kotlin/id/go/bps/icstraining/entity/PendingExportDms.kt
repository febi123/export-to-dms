package id.go.bps.icstraining.entity

import org.hibernate.annotations.GenericGenerator
import java.time.LocalDateTime
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table
import javax.validation.constraints.NotEmpty
import javax.validation.constraints.NotNull
import javax.validation.constraints.Size

@Entity
@Table(name = "pending_export_dms")
data class PendingExportDms(
        @Id
        @GeneratedValue(generator = "system-uuid")
        @GenericGenerator(name = "system-uuid", strategy = "uuid2")
        val id:String?,

        @NotNull @NotEmpty @Size(min = 36, max = 36)
        val surveyPeriodeId:String?,

        val createdDate: LocalDateTime?,

        val statusId:Int?,

        val note:String?
)