package resources.strings.en

import helpers.DeviceInformation
import resources.strings.Strings

object StringsEn : Strings {
    // welcome
    override val welcomeMessage = "Welcome to Manexp!"
    override val setupMessage = "To begin, connect to your Google account, then click on Synchronize. You can also download the application on your device."
    override val iosDevice = "IOS device detected. You can install the application using Safari by clicking on \"Share\" (square with up arrow) and \"Add to home screen\"."
    override val connectToRegister = "Network connection is required during the registration process. Activate it to continue."
    override val manexpDescription = "Track and manage your farm with ease — even offline."
    override val footer = { version: String ->
        "Version $version • Need help? Contact edouard.brulhart@manexp.ch"
    }

    // Login
    override val loginSuccess = "Login successful!"
    override val deviceDeleted = "Device deleted"
    override val unknownError = "Unknown error"
    override val noInternet = "No internet connection. Please connect to the internet and reload the app."
    override val connectingToGoogle = "Connecting to Google..."

    // Import data
    override val importMessage = "Import data from another google account"
    override val importDescription = "First download the manexp_data folder from the old google account's google drive on your device. Then select it with the picker below and confirm with the upload button."
    override val importWarning = "Don't do this operation if you already have important data on this google account. The manexp_data folder will be entirely replaced by the selected one."
    override val importInProgress = "Upload in progress, please don't refresh the page..."
    override val folderReadError = "Unable to read the selected folder"
    override val notManexpFolder = "The selected folder doesn't correspond to Manexp data"
    override val uploadError = "Unable to upload the folder, please try again later."

    // Development
    override val devModeOff = "Development mode disabled"
    override val devModeOn = "Development mode enabled"
    override val featureInDevelopment = "This feature is in development, it is thus subject to bug, change or deletion."

    // Error Page
    override val errorOccurred = "An error occurred:"
    override val reconnect = "Reconnect"
    override val reloadApp = "Reload the app"

    // date
    override val date = "Date"

    // months
    override val january = "January"
    override val february = "February"
    override val march = "March"
    override val april = "April"
    override val may = "May"
    override val june = "June"
    override val july = "July"
    override val august = "August"
    override val september = "September"
    override val october = "October"
    override val november = "November"
    override val december = "December"

    // days
    override val monday = "Monday"
    override val mon = "Mon."
    override val tuesday = "Tuesday"
    override val tue = "Tue."
    override val wednesday = "Wednesday"
    override val wed = "Wed."
    override val thursday = "Thursday"
    override val thu = "Thu."
    override val friday = "Friday"
    override val fri = "Fri."
    override val saturday = "Saturday"
    override val sat = "Sat."
    override val sunday = "Sunday"
    override val sun = "Sun."

    // incompatible browser
    override val incompatibleBrowserPWA = "This browser doesn't support application installation. It is advised to use another browser for an optimal experience."
    override val incompatibleBrowserDB = "This browser does not support database management. Use another browser."

    // installation
    override val installButton = "Install the app"
    override val connectButton = "Connected to Google"
    override val connectionError = "Connection to Google failed, please try again."
    override val otherAccountError = "Stored account and selected account differ. Please select the correct account."
    override val synchronizeButton = "Synchronize"
    override val manualImportButton = "Import data"
    override val cannotInstall = "Use another browser to install the application."
    override val installed = "Application installed"

    // pages
    override val manexpPage = "Manexp"
    override val home = "Home"
    override val milking = "Milking"
    override val livestock = "Livestock"
    override val outings = "Outings"
    override val fields = "Fields"

    // Network
    override val noNetwork = "You are not connected to network!"

    // Database
    override val updateSuccess = "Database updated successfully!"
    override val updateError = "Failed to update database, please try again."
    override val pictureStorageError = "Failed to store picture."

    // Information panel
    override val settings = "Settings"
    override val about = "About"
    override val contact = "Contact"
    override val contactDev = "Manexp: Contact the developer"
    override val termsOfUse = "Terms of use"
    override val bugReport = "Bug report"
    override val reportSubject = "Manexp: Report a bug"
    override val reportBody = { version: String, build: String, device: DeviceInformation ->
        "Bug description:\n(Example: Outings calendar is crashing when accessing conceptor)\n\n\n" +
                "Bug reproduction steps:\n(Example:\n1. Open outings calendar\n2. Open conceptor\n3. Application is crashing)\n\n\n" +
                "Expected behavior:\n(Example: Application should show groups to move them.)\n\n\n" +
                "Additional context:\n(Example: Only crashes during morning)\n\n\n" +
                "Version: $version\nBuild: $build\nDevice: $device"
    }
    override val newFeature = "Request a new feature"
    override val newFeatureSubject = "Manexp: Request a new feature"
    override val newFeatureBody = "New feature description:\n(Example: Create a new mode to manage births and insemination\n\n\n" +
            "Full name:\n\n\n" +
            "Phone number:\n\n\n"
    override val debugger = "Open debug console"

    // Necklace management
    override val necklace = { number: Int ->
        "Necklace $number"
    }
    override val noLinkedNecklace = "No linked necklace."
    override val necklaceNotLinked = "No linked animal or incompatible animal"
    override val linkNecklace = "Link"
    override val selectNecklace = "Select the necklace to link to the animal"
    override val necklaceAlreadyAttributed = "This necklace is already attributed."
    override val warningLinkedNecklaceTitle = "Linked necklace"
    override val warningLinkedNecklaceMessage = "This animal is attributed to a necklace. Are you sure you want to remove it? If you accept, the link will be removed too."
    override val necklaceQuantity = "Necklace amount"

    // Device
    override val noDevice = "No device found"
    override val linkedDevices = "Linked devices"
    override val browser = "Browser"
    override val vendor = "Vendor"
    override val model = "Model"
    override val type = "Type"
    override val platform = "Platform"
    override val lastSeen = "Last seen"
    override val unlinkDeviceTitle = "Unlink device"
    override val unlinkDeviceMessage = "Are you sure you want to unlink this device?"
    override val unlinkDeviceFailed = "Failed to unlink device"
    override val unlinkOwnDeviceTitle = "Unlink this device"
    override val unlinkOwnDeviceMessage = "You are about to unlink your own device, are you sure you want to continue?"
    override val necklaceNotAllowed = "Link to a necklace is restrained to dairy animals. If you want to allow adding necklaces to any animal, got to settings and change the preference."

    // Version
    override val validity = "Validity"
    override val version = "Version"
    override val build = "Build"

    // confirm/cancel
    override val confirm = "Confirm"
    override val cancel = "Cancel"
    override val clear = "Clear"
    override val modify = "Modify"

    // new version
    override val newVersion = "New version installed"

    // terms
    override val terms = "/terms/terms_of_use_en.html"

    // Test version
    override val trialFinished = "Trial period finished"
    override val getPaidVersion = "Get the paid version"
    override val getPaidSubject = "Request for paid version"
    override val getPaidBody = "Thank you for using Manexp! To access the paid version, " +
            "please fill in the following information and I will contact you shortly:" +
            "\n\nFirst and last name:\nPhone number:\nCanton of residence:\nAddress:\nActivity of your exploitation:"
    override val unlimited = "Unlimited"

    // General
    override val none = "None"
    override val yes = "Yes"
    override val no = "No"
    override val to = "to"
    override val legend = { period: String ->
        "Production deviation from $period milking average over the last ten days"
    }
    override val noData = "No data available"
    override val generatePDF = "Generate PDF"
    override val loading = "Loading..."

    // Global synchronization
    override val synchronize = "Synchronization with Google Drive"
    override val askSynchronize = "Do you want to synchronize with Google Drive?"
    override val syncMessage = "Synchronization with Google Drive in progress, do not close the page..."
    override val databaseSynchronization = "Database synchronization"
    override val picturesSynchronization = "Pictures synchronization"
    override val syncSuccess = "Synchronization with Google Drive successful!"
    override val syncError = "Synchronization with Google Drive failed, please try again."

    // DB synchronization
    override val checkDBStatus = "Checking database state..."
    override val checkDBStatusFinished = "State correctly checked. Proceeding to database synchronization..."
    override val syncDBFinished = "Database synchronization finished with success!"
    override val downloadingDB = { table: String ->
        "Downloading $table table..."
    }
    override val downloadedDB = { table: String ->
        "Table $table successfully downloaded"
    }
    override val uploadingDB = { table: String ->
        "Uploading $table table..."
    }
    override val uploadedDB = { table: String ->
        "Table $table successfully uploaded"
    }
    override val syncingDB = { table: String ->
        "Syncing $table table..."
    }
    override val syncedDB = { table: String ->
        "Table $table successfully synced"
    }

    // Pic synchronization
    override val checkPicStatus = "Checking pictures state..."
    override val checkPicStatusFinished = "State correctly checked. Proceeding to pictures synchronization..."
    override val syncPicFinished = "Pictures synchronization finished with success!"
    override val downloadingPic = { earTag: String ->
        "Downloading pictures of animal $earTag..."
    }
    override val downloadedPic = { earTag: String ->
        "Pictures of animal $earTag successfully downloaded"
    }
    override val uploadingPic = { earTag: String ->
        "Uploading pictures of animal $earTag..."
    }
    override val uploadedPic = { earTag: String ->
        "Pictures of animal $earTag successfully uploaded"
    }
    override val syncingPic = { earTag: String ->
        "Syncing pictures of animal $earTag..."
    }
    override val syncedPic = { earTag: String ->
        "Pictures of animal $earTag successfully synced"
    }

    // Settings
    override val settingsChooseModes = "What do you want to manage with Manexp?"
    override val general = "General"
    override val enableMasterPassword = "Enable master password. This password protects all administrator settings from edition by unallowed users. It will unlock every password protected area inside this application."
    override val pdfRestricted = "Restrict PDF export. This setting protects PDF generation by password. When a user wants to generate a PDF in a mode that is restricted he will be prompted to enter the mode password or the master password"
    override val enablePassword = "Enable password"
    override val password = "Password"
    override val loadSettings = "Loading settings..."
    override val invalidSettings = { errorMessage: String ->
        "Invalid settings: $errorMessage"
    }
    override val masterPasswordRequired = "Master password required"
    override val livestockPasswordRequired = "Livestock password required"
    override val minimumOneNecklaceRequired = "You must have at least one necklace"
    override val milkingPasswordRequired = "Milking password required"
    override val minimumOneMilkingPositionRequired = "You must have at least one milking position"
    override val outingsPasswordRequired = "Outings password required"
    override val fieldsPasswordRequired = "Fields password required"
    override val noSettings = "No settings found"
    override val passwordValidity = "Select unlock duration in minutes after entering password. This value will define the time during the user will be allowed to user the unlocked area before being prompted to entre password again."
    override val atLeastOneMode = "You need to select at least one mode"

    // Password
    override val noPassword = "No password"
    override val wrongPassword = "Wrong password"
    override val unlockMode = { mode: String, minutes: Int ->
        "Unlock $mode $minutes minutes"
    }
    override val admin = "Admin"
    override val restrictMode = { mode: String ->
        "Restrict $mode mode with a password. This will restrict edition, not visualisation. This means every user will be able to see information, but won't be able to edit it without password."
    }

    // Camera
    override val flashNotSupported = "Flash is not supported"
    override val head = "Head picture"
    override val rightSide = "Right side picture"
    override val leftSide = "Left side picture"
    override val noPictures = "No pictures available."
    override val picturesDate = { date: String ->
        "Pictures taken on $date"
    }
    override val warningDeleteTitle = "Confirm deletion"
    override val warningDeleteMessage = "Are you sure you want to delete this element? This operation cannot be undone."

    // Livestock
    override val addAnimal = "Start by adding an animal"
    override val agateImport = "Import animals from Agate"
    override val agateImportMessage = "Go to Agate website, get the excel file containing your livestock information and select it below"
    override val agateImportInformation = "Only animals with a valid name and absent from Manexp will be imported"
    override val importExcel = "Import Excel file"
    override val validatePreview = "Before confirmation, check that data are associated to the right column and correctly formatted"
    override val notExcelFile = "Selected file is not an excel file"
    override val invalidExcelFile = "Couldn't import animals from file. If the issue persists, please submit an issue with the excel file attached."
    override val profile = "Profile"
    override val necklaceNumber = "Necklace number"
    override val allAnimalsNecklaced = "Allow all animals to have a necklace. This setting defines if males and juveniles can also be linked to a necklace."
    override val searchAnimal = "Find an animal"
    override val sortName = "Sort by name"
    override val sortEarTag = "Sort by ear tag"
    override val sortBirthDate = "Sort by birth date"
    override val sortNecklace = "Sort by necklace"
    override val add = "Add"
    override val earTag = "Ear tag"
    override val name = "Name"
    override val sex = "Sex"
    override val arrivalDate = "Arrival date"
    override val birthDate = "Birth date"
    override val selectSex = "Select sex"
    override val noEarTag = "No or invalid ear tag"
    override val noName = "No name entered"
    override val noSex = "No sex selected"
    override val noArrivalDate = "No arrival date selected"
    override val noBirthDate = "No birth date selected"
    override val departureDate = "Departure date"
    override val animalDeparted = "Animal is marked as departed. Re-add it to perform operations on it."
    override val invalidDate = "Invalid date"
    override val noDepartureDate = "No departure date selected"
    override val noAnimal = "No animal selected"

    // Dairy
    override val addDairies = "Add dairy animals before milking. To do so, go to livestock and click on the animals you want to milk. You will be guided to create your first dairy animals."
    override val addAsDairy = "Add this animal to dairy animals"
    override val animalIsValidDairy = "This animal meets the conditions to be a dairy animal. Do you want to add it?"
    override val noBeginningProductionDate = "No beginning production date selected"
    override val warningActiveDairyTitle = "Active dairy animal"
    override val warningActiveDairyMessage = "This animal is an active dairy animal. Are you sure you want to remove it? If you continue, it will be inactivated."
    override val calvingDate = "Calving date"
    override val noCalvingDate = "No calving date selected"
    override val dryDate = "Dry date"
    override val noDryDate = "No dry date selected"
    override val dairyTriggerFailed = "Failed to update dairy animals. Try to reload the page. If the issue persists, please submit an issue."

    // Lactations
    override val lactations = "Lactations"
    override val lactation = "lactation"
    override val lactationNumber = { number: Int ->
        "lactation $number"
    }
    override val beginningLactationDate = "Calving date"
    override val endLactationDate: String = "Dry period date"
    override val noEndLactationDate: String = "No dry date"
    override val addCalving = "Calving"
    override val addDried = "Dry"

    // Treatment
    override val selectedNumber = {selected: Int, total: Int ->
        "Selected animals: $selected/$total"
    }
    override val treatments = "Treatments"
    override val treatment = "Treatment"
    override val noTreatment = "No treatment entered"
    override val medicine = "Medicine"
    override val noMedicine = "No medicine entered"
    override val dosage = "Dosage"
    override val noDosage = "No dosage entered"
    override val beginningTreatmentDate = "Beginning of treatment"
    override val noBeginningTreatmentDate = "No beginning of treatment selected"
    override val endTreatmentDate = "End of treatment"
    override val noEndTreatmentDate = "No end of treatment selected"
    override val period = "Period"
    override val periodValue = { value: Int -> "$value days" }
    override val milkReleaseDate = "Milk release"
    override val noMilkReleaseDate = "No milk release selected"
    override val meatReleaseDate = "Meat release"
    override val noMeatReleaseDate = "No meat release selected"
    override val additionalInformation = "Additional information"
    override val inProduction = "kept in production"
    override val keepInProduction = "Keep in production"
    override val rightFrontTeatTreated = "Right front teat treated"
    override val rightFrontTeat = "Right front teat"
    override val leftFrontTeatTreated = "Left front teat treated"
    override val leftFrontTeat = "Left front teat"
    override val rightRearTeatTreated = "Right rear teat treated"
    override val rightRearTeat = "Right rear teat"
    override val leftRearTeatTreated = "Left rear teat treated"
    override val leftRearTeat = "Left rear teat"
    override val confirmRemoveTreatmentTitle = "Remove treatment"
    override val confirmRemoveTreatmentMessage = "Are you sure you want to remove this treatment? This action cannot be undone."
    override val treatmentTriggerFailed = "Failed to update treatments. Try to reload the page. If the issue persists, please submit an issue."
    override val sickTitle = "Sick animal"
    override val sickNoProductionMessage = "This animal is sick and the milk is unfit for consumption. Don't put it in production."
    override val sickProductionMessage = "Treated teats to not put in production:"

    // Milking
    override val datedMilkProduction = { date: String ->
        "Milk production on $date"
    }
    override val partOfDayMilkProduction = { partOfDay: String, value: String ->
        "$partOfDay milk production: $value kg"
    }
    override val totalMilkProduction = { value: String ->
        "Total milk production: $value kg"
    }
    override val noMilkProduction = "No milk production available for this day"
    override val dairyProfile = "Dairy profile"
    override val leftMilkingPositions = "Left milking positions"
    override val rightMilkingPositions = "Right milking positions"
    override val beginningProductionDate = "Beginning production date"
    override val retirementDate = "Retirement date"
    override val milkCycle = "Milk cycle"
    override val inactiveDairy = "Inactive dairy animal"
    override val calvingTitle = "Freshly calved"
    override val calvingMessage = "This animal freshly calved. Don't put milk in production."
    override val alreadySelected = "Dairy animal is already selected."
    override val alreadyMilkedTitle = "Animal already milked"
    override val alreadyMilkedMessage = "Do you want to navigate to the statistics page?"
    override val milkProductionError = "Failed to register a production. Please verify entry. If the issue persists, please submit an issue."
    override val nothingToSave = "None of the positions are valid. Verify that you have at least one position that contains an animal and a valid production value."
    override val selectMilkProductionDayTitle = "Generate milk production summary"
    override val selectMilkProductionDayEntry = "Select the production day to generate"
    override val noMilkProductionDate = "No milk production date selected"
    override val milkProductionPDF = { date: String ->
        "milk_production_$date.pdf"
    }
    override val mean = { partOfDay: String, value: String ->
        "10 last $partOfDay milk productions mean:\n $value kg"
    }
    override val deviation = { value: String ->
        "Deviation from mean of the current value:\n $value%"
    }
    override val milkedValue = "Actual production (kg):"

    // Milk cycles
    override val production = "Production"
    override val dried = "Dried"
    override val calving = "Calving"
    override val selectMilkCycle = "Select a milk cycle"
    override val noMilkCycle = "No milk cycle selected"

    // Countries
    override val switzerland = "Switzerland"

    // Property status
    override val owner = "Owner"
    override val lodger = "Lodger"
    override val other = "Other"

    // Sex
    override val male = "Male"
    override val female = "Female"

    // parts of day
    override val morning = "Morning"
    override val evening = "Evening"
    override val total = "Total"
    override val totalProduction = "General"
    override val kilograms = "kilograms"
    override val kg = "kg"
    override val beginning = "Beginning"
    override val end = "End"
    override val displayedProduction = { value: String ->
        "Displayed production: $value kg"
    }
    override val dayNumber = { value: Int ->
        "$value days"
    }
    override val d305 = "305 days filter"

    // Outings
    override val courtyard = "Courtyard"
    override val courtyardLetter = "C"
    override val pasture = "Pasture"
    override val pastureLetter = "P"
    override val badWeather = "Bad weather"
    override val badWeatherLetter = "B"
    override val notDefined = "Not defined"
    override val notDefinedLetter = "N"
    override val paused = "Paused"
    override val modifyGlobal = "Modify globally"
    override val modifyDay = { date: String ->
        "Modify $date"
    }
    override val outingsPDFTitle = { year: Int ->
        "Outings calendar $year"
    }
    override val outingsPDFName = { year: Int ->
        "outings_calendar_$year.pdf"
    }

    // Outing groups
    override val addGroup = "Start by adding outing groups"
    override val groupName = "Group name"
    override val cows = "Cows"
    override val maxTenCharacters = "Name is limited to 10 characters without spaces"
    override val nameAlreadyExists = "Name already exists"

    // Fields
    override val searchFields = "Find fields"
    override val sortSurface = "Sort by surface"
    override val sortProperty = "Sort by property"
    override val sortNumber = "Sort by number"
    override val sortID = "Sort by identifier"
    override val sortMunicipality = "Sort by municipality"
    override val sortCanton = "Sort by canton"
    override val fetchLandData = "Fetching land data..."
    override val zoomInFirst = "Zoom in first to select a land"
    override val noLandData = "No land data found, please try again. If the issue persists, please contact the developer."
    override val importLand = "Import this land?"
    override val landId = {id: String? ->
        if (id != null) {
            "Identifier: $id"
        } else {
            "Identifier"
        }
    }
    override val number = {number: String? ->
        if (number != null) {
            "Number: $number"
        } else  {
            "Number"
        }
    }
    override val surface = {surface: String? ->
        if (surface != null) {
            "Surface: $surface hectares"
        } else {
            "Surface"
        }
    }
    override val municipality = {municipality: String? ->
        if (municipality != null) {
            "Municipality: $municipality"
        } else {
            "Municipality"
        }
    }
    override val municipalityNumber = {number: String? ->
        if (number != null) {
            "Municipality number: $number"
        } else {
            "Municipality number"
        }
    }
    override val canton = {canton: String? ->
        if (canton != null) {
            "Canton: $canton"
        } else {
            "Canton"
        }
    }
    override val country = {country: String? ->
        if (country != null) {
            "Country: $country"
            } else {
            "Country"
        }
    }
    override val landPDF = {link: String? ->
        if (link != null) {
            "Land PDF: $link"
        } else {
            "Land PDF"
        }
    }
    override val landLink = {link: String? ->
        if (link != null) {
            "Land link: $link"
        } else {
            "Land link"
        }
    }
    override val cadastreAddress = {address: String? ->
        if (address != null) {
            "Cadastre address: $address"
        } else {
            "Cadastre address"
             }
    }
    override val cadastrePostalCode = {code: String? ->
        if (code != null) {
            "Cadastre postal code: $code"
            } else {
            "Cadastre postal code"
        }
    }
    override val cadastreMunicipality = {municipality: String? ->
        if (municipality != null) {
            "Cadastre municipality: $municipality"
        } else {
            "Cadastre municipality"
        }
    }
    override val cadastreEmail = {email: String? ->
        if (email != null) {
            "Cadastre email: $email"
        } else {
            "Cadastre email"
        }
    }
    override val cadastrePhone = {phone: String? ->
        if (phone != null) {
            "Cadastre phone: $phone"
        } else {
            "Cadastre phone"
        }
    }
    override val cadastreLink = {link: String? ->
        if (link != null) {
            "Cadastre link: $link"
        } else {
            "Cadastre link"
        }
    }
    override val propertyStatus = { status: String? ->
        if (status != null) {
            "Property status: $status"
        } else {
            "Property status"
        }
    }
    override val landName = "Land name"
    override val land = "land"
    override val cadastre = "Cadastre"
    override val selectProperty = "Select property status"
    override val invalidLandData = "Please fill all the required fields before saving this land."

    // Location
    override val noLocation = "Location not ready, unavailable or not granted"

    // unknown
    override val unknown = "Unknown"

    // migration1
    override val Migration1ErrorNoContent = "❌ Error retrieving old data, empty content. ❌"
    override val Migration1ErrorMalformedEntry = "❌ Skipping some malformed data, please contact developer to fix it ❌"
    override val Migration1MigrateMilkProductionTitle = "Milk production migration"
    override val Migration1MigrateMilkProductionStart = "Starting milk production migration..."
    override val Migration1MigrateMilkProductionStatus = { actualValue: Int, totalValue: Int ->
        "Migrating animal $actualValue/$totalValue..."
    }
    override val Migration1MigrateMilkProductionSuccess = "✅ Milk production migration successful ✅"
}