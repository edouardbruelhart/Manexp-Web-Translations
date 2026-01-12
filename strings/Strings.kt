package resources.strings

import helpers.DeviceInformation

interface Strings {

    // welcome
    val welcomeMessage: String
    val setupMessage: String
    val iosDevice: String
    val connectToRegister: String
    val manexpDescription: String
    val footer: (String) -> String

    // Login
    val loginSuccess: String
    val deviceDeleted: String
    val unknownError: String
    val noInternet: String
    val connectingToGoogle: String

    // Import data
    val importMessage: String
    val importDescription: String
    val importWarning: String
    val importInProgress: String
    val folderReadError: String
    val notManexpFolder: String
    val uploadError: String

    // Development
    val devModeOff: String
    val devModeOn: String
    val featureInDevelopment: String

    // Error Page
    val errorOccurred: String
    val reconnect: String
    val reloadApp: String

    // date
    val date: String

    // months
    val january: String
    val february: String
    val march: String
    val april: String
    val may: String
    val june: String
    val july: String
    val august: String
    val september: String
    val october: String
    val november: String
    val december: String

    // days
    val monday: String
    val mon: String
    val tuesday: String
    val tue: String
    val wednesday: String
    val wed: String
    val thursday: String
    val thu: String
    val friday: String
    val fri: String
    val saturday: String
    val sat: String
    val sunday: String
    val sun: String

    // incompatible browser
    val incompatibleBrowserPWA: String
    val incompatibleBrowserDB: String

    // installation
    val installButton: String
    val connectButton: String
    val connectionError: String
    val otherAccountError: String
    val synchronizeButton: String
    val manualImportButton: String
    val cannotInstall: String
    val installed: String

    // pages
    val manexpPage: String
    val home: String
    val milking: String
    val livestock: String
    val outings: String
    val fields: String

    // Network
    val noNetwork: String

    // Database
    val updateSuccess: String
    val updateError: String
    val pictureStorageError: String

    // Information panel
    val settings: String
    val about: String
    val contact: String
    val contactDev: String
    val termsOfUse: String
    val bugReport: String
    val reportSubject: String
    val reportBody: (String, String, DeviceInformation) -> String
    val newFeature: String
    val newFeatureSubject: String
    val newFeatureBody: String
    val debugger: String

    // Necklace management
    val necklace: (Int) -> String
    val noLinkedNecklace: String
    val necklaceNotLinked: String
    val linkNecklace: String
    val selectNecklace: String
    val necklaceAlreadyAttributed: String
    val warningLinkedNecklaceTitle: String
    val warningLinkedNecklaceMessage: String
    val necklaceQuantity: String
    val necklaceNotAllowed: String

    // Device
    val noDevice: String
    val linkedDevices: String
    val browser: String
    val vendor: String
    val model: String
    val type: String
    val platform: String
    val lastSeen: String
    val unlinkDeviceTitle: String
    val unlinkDeviceMessage: String
    val unlinkDeviceFailed: String
    val unlinkOwnDeviceTitle: String
    val unlinkOwnDeviceMessage: String

    // Version
    val validity: String
    val version: String
    val build: String

    // confirm/cancel
    val confirm: String
    val cancel: String
    val clear: String
    val modify: String

    // new version
    val newVersion: String

    // terms
    val terms: String

    // Test version
    val trialFinished: String
    val getPaidVersion: String
    val getPaidSubject: String
    val getPaidBody: String
    val unlimited: String

    // General
    val none: String
    val yes: String
    val no: String
    val to: String
    val legend: (String) -> String
    val noData: String
    val generatePDF: String
    val loading: String

    // Global synchronization
    val synchronize: String
    val askSynchronize: String
    val syncMessage: String
    val databaseSynchronization: String
    val picturesSynchronization: String
    val syncSuccess: String
    val syncError: String

    // DB synchronization
    val checkDBStatus: String
    val checkDBStatusFinished: String
    val syncDBFinished: String
    val downloadingDB: (String) -> String
    val downloadedDB: (String) -> String
    val uploadingDB: (String) -> String
    val uploadedDB: (String) -> String
    val syncingDB: (String) -> String
    val syncedDB: (String) -> String

    // Pic synchronization
    val checkPicStatus: String
    val checkPicStatusFinished: String
    val syncPicFinished: String
    val downloadingPic: (String) -> String
    val downloadedPic: (String) -> String
    val uploadingPic: (String) -> String
    val uploadedPic: (String) -> String
    val syncingPic: (String) -> String
    val syncedPic: (String) -> String

    // Settings
    val settingsChooseModes: String
    val general: String
    val enableMasterPassword: String
    val pdfRestricted: String
    val enablePassword: String
    val password: String
    val loadSettings: String
    val invalidSettings: (String) -> String
    val masterPasswordRequired: String
    val livestockPasswordRequired: String
    val minimumOneNecklaceRequired: String
    val milkingPasswordRequired: String
    val minimumOneMilkingPositionRequired: String
    val outingsPasswordRequired: String
    val fieldsPasswordRequired: String
    val noSettings: String
    val passwordValidity: String
    val atLeastOneMode: String

    // Passwords
    val noPassword: String
    val wrongPassword: String
    val unlockMode: (String, Int) -> String
    val admin: String
    val restrictMode: (String) -> String

    // Camera
    val flashNotSupported: String
    val head: String
    val rightSide: String
    val leftSide: String
    val noPictures: String
    val picturesDate: (String) -> String
    val warningDeleteTitle: String
    val warningDeleteMessage: String

    // Livestock
    val addAnimal: String
    val agateImport: String
    val importExcel: String
    val validatePreview: String
    val notExcelFile: String
    val invalidExcelFile: String
    val agateImportMessage: String
    val agateImportInformation: String
    val profile: String
    val necklaceNumber: String
    val allAnimalsNecklaced: String
    val searchAnimal: String
    val sortName: String
    val sortEarTag: String
    val sortBirthDate: String
    val sortNecklace: String
    val add: String
    val earTag: String
    val name: String
    val sex: String
    val arrivalDate: String
    val birthDate: String
    val selectSex: String
    val noEarTag: String
    val noName: String
    val noSex: String
    val noArrivalDate: String
    val noBirthDate: String
    val departureDate: String
    val animalDeparted: String
    val invalidDate: String
    val noDepartureDate: String
    val noAnimal: String

    // Dairy
    val addDairies: String
    val addAsDairy: String
    val animalIsValidDairy: String
    val noBeginningProductionDate: String
    val warningActiveDairyTitle: String
    val warningActiveDairyMessage: String
    val calvingDate: String
    val noCalvingDate: String
    val dryDate: String
    val noDryDate: String
    val dairyTriggerFailed: String

    // Lactations
    val lactations: String
    val lactation: String
    val lactationNumber: (Int) -> String
    val beginningLactationDate: String
    val endLactationDate: String
    val noEndLactationDate: String
    val addCalving: String
    val addDried: String

    // Treatment
    val selectedNumber: (Int, Int) -> String
    val treatments: String
    val treatment: String
    val noTreatment: String
    val medicine: String
    val noMedicine: String
    val dosage: String
    val noDosage: String
    val beginningTreatmentDate: String
    val noBeginningTreatmentDate: String
    val endTreatmentDate: String
    val noEndTreatmentDate: String
    val period: String
    val periodValue: (Int) -> String
    val milkReleaseDate: String
    val noMilkReleaseDate: String
    val meatReleaseDate: String
    val noMeatReleaseDate: String
    val additionalInformation: String
    val inProduction: String
    val keepInProduction: String
    val rightFrontTeatTreated: String
    val rightFrontTeat: String
    val leftFrontTeatTreated: String
    val leftFrontTeat: String
    val rightRearTeatTreated: String
    val rightRearTeat: String
    val leftRearTeatTreated: String
    val leftRearTeat: String
    val confirmRemoveTreatmentTitle: String
    val confirmRemoveTreatmentMessage: String
    val treatmentTriggerFailed: String
    val sickTitle: String
    val sickNoProductionMessage: String
    val sickProductionMessage: String

    // Milking
    val datedMilkProduction: (String) -> String
    val partOfDayMilkProduction: (String, String) -> String
    val totalMilkProduction: (String) -> String
    val noMilkProduction: String
    val dairyProfile: String
    val leftMilkingPositions: String
    val rightMilkingPositions: String
    val beginningProductionDate: String
    val retirementDate: String
    val milkCycle: String
    val inactiveDairy: String
    val calvingTitle: String
    val calvingMessage: String
    val alreadySelected: String
    val alreadyMilkedTitle: String
    val alreadyMilkedMessage: String
    val milkProductionError: String
    val nothingToSave: String
    val selectMilkProductionDayTitle: String
    val selectMilkProductionDayEntry: String
    val noMilkProductionDate: String
    val milkProductionPDF: (String) -> String
    val mean: (String, String) -> String
    val deviation: (String) -> String
    val milkedValue: String

    // Milk cycles
    val production: String
    val dried: String
    val calving: String
    val selectMilkCycle: String
    val noMilkCycle: String

    // Countries
    val switzerland: String

    // Property status
    val owner: String
    val lodger: String
    val other: String

    // Sex
    val male: String
    val female: String

    // parts of day
    val morning: String
    val evening: String
    val total: String
    val totalProduction: String
    val kilograms: String
    val kg: String
    val beginning: String
    val end: String
    val displayedProduction: (String) -> String
    val dayNumber: (Int) -> String
    val d305: String

    // Outings
    val courtyard: String
    val courtyardLetter: String
    val pasture: String
    val pastureLetter: String
    val badWeather: String
    val badWeatherLetter: String
    val notDefined: String
    val notDefinedLetter: String
    val paused: String
    val modifyGlobal: String
    val modifyDay: (String) -> String
    val outingsPDFTitle: (Int) -> String
    val outingsPDFName: (Int) -> String

    // Outing groups
    val addGroup: String
    val groupName: String
    val cows: String
    val maxTenCharacters: String
    val nameAlreadyExists: String

    // Fields
    val searchFields: String
    val sortSurface: String
    val sortProperty: String
    val sortNumber: String
    val sortID: String
    val sortMunicipality: String
    val sortCanton: String
    val fetchLandData: String
    val zoomInFirst: String
    val noLandData: String
    val importLand: String
    val landId: (String?) -> String
    val number: (String?) -> String
    val surface: (String?) -> String
    val municipality: (String?) -> String
    val municipalityNumber: (String?) -> String
    val canton: (String?) -> String
    val country: (String?) -> String
    val landPDF: (String?) -> String
    val landLink: (String?) -> String
    val cadastreAddress: (String?) -> String
    val cadastrePostalCode: (String?) -> String
    val cadastreMunicipality: (String?) -> String
    val cadastreEmail: (String?) -> String
    val cadastrePhone: (String?) -> String
    val cadastreLink: (String?) -> String
    val propertyStatus: (String?) -> String
    val landName: String
    val land: String
    val cadastre: String
    val selectProperty: String
    val invalidLandData: String

    // Location
    val noLocation: String

    // unknown
    val unknown: String

    // migration1
    val Migration1ErrorNoContent: String
    val Migration1ErrorMalformedEntry: String
    val Migration1MigrateMilkProductionTitle: String
    val Migration1MigrateMilkProductionStart: String
    val Migration1MigrateMilkProductionStatus: (Int, Int) -> String
    val Migration1MigrateMilkProductionSuccess: String
}
