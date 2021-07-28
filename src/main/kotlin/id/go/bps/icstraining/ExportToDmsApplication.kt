package id.go.bps.icstraining

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ExportToDmsApplication

fun main(args: Array<String>) {
	runApplication<ExportToDmsApplication>(*args)
}
