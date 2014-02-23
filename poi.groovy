// Apache POI
def poi(poiVersion = '3.9') {
	platform {
		merge(failOnDuplicate: false) {
			bundle "org.apache.poi:poi:$poiVersion"
			bundle "org.apache.poi:poi-ooxml:$poiVersion"
			bundle "org.apache.poi:poi-ooxml-schemas:$poiVersion"
			
			bnd {
				symbolicName = 'org.apache.poi'
				bundleName = 'Apache POI'
				version = poiVersion
				instruction 'Import-Package', '!schemasMicrosoftComOfficePowerpoint,!schemasMicrosoftComOfficeWord,!org.openxmlformats.*,!org.apache.poi.*,org.apache.xmlbeans.impl.schema,*'
			}
		}
	}
}

poi()