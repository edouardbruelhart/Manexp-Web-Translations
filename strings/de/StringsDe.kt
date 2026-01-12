package resources.strings.de

import helpers.DeviceInformation
import resources.strings.Strings

object StringsDe : Strings {
    // welcome
    override val welcomeMessage = "Willkommen bei Manexp!"
    override val setupMessage = "Beginnen Sie, indem Sie sich mit Ihrem Google-Konto verbinden und dann auf Synchronisieren klicken. Sie können die Anwendung auch auf Ihr Gerät herunterladen."
    override val iosDevice = "iOS-Gerät erkannt. Sie können die App mit Safari installieren, indem Sie auf „Teilen“ (Quadrat mit Pfeil nach oben) und „Zum Home-Bildschirm hinzufügen“ klicken."
    override val connectToRegister = "Für den Registrierungsprozess ist eine Netzwerkverbindung erforderlich. Aktivieren Sie diese, um fortzufahren."
    override val manexpDescription = "Verfolgen und verwalten Sie Ihren Betrieb ganz einfach — sogar offline."
    override val footer = { version: String ->
        "Version $version • Brauchen Sie Hilfe? Kontaktieren Sie edouard.brulhart@manexp.ch"
    }

    // Login
    override val loginSuccess = "Login erfolgreich!"
    override val deviceDeleted = "Gerät gelöscht"
    override val unknownError = "Unbekannter Fehler"
    override val noInternet = "Keine Internetverbindung. Bitte verbinden Sie sich mit dem Internet und laden Sie die App neu."
    override val connectingToGoogle = "Verbinden mit Google..."

    // Import data
    override val importMessage = "Daten von einem anderen Google-Konto importieren"
    override val importDescription = "Laden Sie zuerst den Ordner manexp_data vom Google Drive des alten Google-Kontos auf Ihr Gerät herunter. Wählen Sie ihn dann unten aus und bestätigen Sie mit dem Upload-Button."
    override val importWarning = "Führen Sie diesen Vorgang nicht durch, wenn Sie bereits wichtige Daten auf diesem Google-Konto haben. Der manexp_data-Ordner wird vollständig durch den ausgewählten ersetzt."
    override val importInProgress = "Upload läuft, bitte Seite nicht aktualisieren..."
    override val folderReadError = "Der ausgewählte Ordner konnte nicht gelesen werden"
    override val notManexpFolder = "Der ausgewählte Ordner entspricht nicht den Manexp-Daten"
    override val uploadError = "Der Ordner konnte nicht hochgeladen werden, bitte versuchen Sie es später erneut."

    // Development
    override val devModeOff = "Entwicklungsmodus deaktiviert"
    override val devModeOn = "Entwicklungsmodus aktiviert"
    override val featureInDevelopment = "Diese Funktion befindet sich noch in der Entwicklung. Daher kann es zu Fehlern, Änderungen oder der Entfernung von Funktionen kommen."

    // Error Page
    override val errorOccurred = "Ein Fehler ist aufgetreten:"
    override val reconnect = "Erneut verbinden"
    override val reloadApp = "App neu laden"

    // date
    override val date = "Datum"

    // months
    override val january = "Januar"
    override val february = "Februar"
    override val march = "März"
    override val april = "April"
    override val may = "Mai"
    override val june = "Juni"
    override val july = "Juli"
    override val august = "August"
    override val september = "September"
    override val october = "Oktober"
    override val november = "November"
    override val december = "Dezember"

    // days
    override val monday = "Montag"
    override val mon = "Mo."
    override val tuesday = "Dienstag"
    override val tue = "Di."
    override val wednesday = "Mittwoch"
    override val wed = "Mi."
    override val thursday = "Donnerstag"
    override val thu = "Do."
    override val friday = "Freitag"
    override val fri = "Fr."
    override val saturday = "Samstag"
    override val sat = "Sa."
    override val sunday = "Sonntag"
    override val sun = "So."

    // incompatible browser
    override val incompatibleBrowserPWA = "Dieser Browser unterstützt die Installation der Anwendung nicht. Für ein optimales Erlebnis wird ein anderer Browser empfohlen."
    override val incompatibleBrowserDB = "Dieser Browser unterstützt keine Datenbankverwaltung. Verwenden Sie einen anderen Browser."

    // installation
    override val installButton = "App installieren"
    override val connectButton = "Mit Google verbunden"
    override val connectionError = "Verbindung zu Google fehlgeschlagen, bitte erneut versuchen."
    override val otherAccountError = "Gespeichertes und ausgewähltes Konto stimmen nicht überein. Bitte wählen Sie das richtige Konto."
    override val synchronizeButton = "Synchronisieren"
    override val manualImportButton = "Daten importieren"
    override val cannotInstall = "Verwenden Sie einen anderen Browser, um die Anwendung zu installieren."
    override val installed = "Anwendung installiert"

    // pages
    override val manexpPage = "Manexp"
    override val home = "Startseite"
    override val milking = "Melken"
    override val livestock = "Viehbestand"
    override val outings = "Ausgänge"
    override val fields = "Felder"

    // Network
    override val noNetwork = "Sie sind nicht mit dem Netzwerk verbunden!"

    // Database
    override val updateSuccess = "Datenbank erfolgreich aktualisiert!"
    override val updateError = "Datenbankaktualisierung fehlgeschlagen, bitte erneut versuchen."
    override val pictureStorageError = "Bild konnte nicht gespeichert werden."

    // Information panel
    override val settings = "Einstellungen"
    override val about = "Über"
    override val contact = "Kontakt"
    override val contactDev = "Manexp: Entwickler kontaktieren"
    override val termsOfUse = "Nutzungsbedingungen"
    override val bugReport = "Fehler melden"
    override val reportSubject = "Manexp: Fehler melden"
    override val reportBody = { version: String, build: String, device: DeviceInformation ->
        "Fehlerbeschreibung:\n(Beispiel: Ausgänge-Kalender stürzt beim Öffnen des Konzepts ab)\n\n\n" +
                "Schritte zur Reproduktion:\n(Beispiel:\n1. Ausgänge-Kalender öffnen\n2. Konzept öffnen\n3. Anwendung stürzt ab)\n\n\n" +
                "Erwartetes Verhalten:\n(Beispiel: Anwendung sollte Gruppen anzeigen, um sie zu verschieben.)\n\n\n" +
                "Zusätzlicher Kontext:\n(Beispiel: Stürzt nur morgens ab)\n\n\n" +
                "Version: $version\nBuild: $build\nGerät: $device"
    }
    override val newFeature = "Neue Funktion anfragen"
    override val newFeatureSubject = "Manexp: Neue Funktion anfragen"
    override val newFeatureBody = "Beschreibung der neuen Funktion:\n(Beispiel: Neuen Modus zur Verwaltung von Geburten und Besamungen erstellen)\n\n\n" +
            "Vollständiger Name:\n\n\n" +
            "Telefonnummer:\n\n\n"
    override val debugger = "Debug-Konsole öffnen"

    // Necklace management
    override val necklace = { number: Int ->
        "Halsband $number"
    }
    override val noLinkedNecklace = "Kein verknüpftes Halsband."
    override val necklaceNotLinked = "Kein verknüpftes Tier oder Tier nicht kompatibel"
    override val linkNecklace = "Verknüpfen"
    override val selectNecklace = "Wählen Sie das Halsband, das dem Tier zugeordnet werden soll"
    override val necklaceAlreadyAttributed = "Dieses Halsband ist bereits zugeordnet."
    override val warningLinkedNecklaceTitle = "Verknüpftes Halsband"
    override val warningLinkedNecklaceMessage = "Dieses Tier ist einem Halsband zugeordnet. Sind Sie sicher, dass Sie es entfernen möchten? Wenn Sie akzeptieren, wird die Verknüpfung ebenfalls entfernt."
    override val necklaceQuantity = "Anzahl Halsbänder"

    // Device
    override val noDevice = "Kein Gerät gefunden"
    override val linkedDevices = "Verknüpfte Geräte"
    override val browser = "Browser"
    override val vendor = "Hersteller"
    override val model = "Modell"
    override val type = "Typ"
    override val platform = "Plattform"
    override val lastSeen = "Zuletzt gesehen"
    override val unlinkDeviceTitle = "Gerät trennen"
    override val unlinkDeviceMessage = "Sind Sie sicher, dass Sie dieses Gerät trennen möchten?"
    override val unlinkDeviceFailed = "Trennen des Geräts fehlgeschlagen"
    override val unlinkOwnDeviceTitle = "Eigenes Gerät trennen"
    override val unlinkOwnDeviceMessage = "Sie sind dabei, Ihr eigenes Gerät zu trennen. Sind Sie sicher, dass Sie fortfahren möchten?"
    override val necklaceNotAllowed = "Die Verknüpfung eines Halsbands ist auf Milchkühe beschränkt. Wenn Sie Halsbänder für alle Tiere erlauben möchten, ändern Sie die Einstellung im Menü."

    // Version
    override val validity = "Gültigkeit"
    override val version = "Version"
    override val build = "Build"

    // confirm/cancel
    override val confirm = "Bestätigen"
    override val cancel = "Abbrechen"
    override val clear = "Löschen"
    override val modify = "Bearbeiten"

    // new version
    override val newVersion = "Neue Version installiert"

    // terms
    override val terms = "/terms/terms_of_use_de.html"

    // Test version
    override val trialFinished = "Testzeitraum beendet"
    override val getPaidVersion = "Bezahlversion erhalten"
    override val getPaidSubject = "Anfrage für Bezahlversion"
    override val getPaidBody = "Vielen Dank, dass Sie Manexp verwenden! Um Zugriff auf die Bezahlversion zu erhalten, " +
            "füllen Sie bitte die folgenden Informationen aus und ich werde mich in Kürze bei Ihnen melden:" +
            "\n\nVor- und Nachname:\nTelefonnummer:\nKanton:\nAdresse:\nTätigkeit Ihres Betriebs:"
    override val unlimited = "Unbegrenzt"

    // General
    override val none = "Keine"
    override val yes = "Ja"
    override val no = "Nein"
    override val to = "bis"
    override val legend = { period: String ->
        "Produktionsabweichung vom Durchschnitt der letzten zehn Tage für die Melkperiode $period"
    }
    override val noData = "Keine Daten verfügbar"
    override val generatePDF = "PDF generieren"
    override val loading = "Laden..."

    // Global synchronization
    override val synchronize = "Synchronisation mit Google Drive"
    override val askSynchronize = "Möchten Sie mit Google Drive synchronisieren?"
    override val syncMessage = "Synchronisation mit Google Drive läuft, Seite bitte nicht schließen..."
    override val databaseSynchronization = "Datenbanksynchronisation"
    override val picturesSynchronization = "Bildersynchronisation"
    override val syncSuccess = "Synchronisation mit Google Drive erfolgreich!"
    override val syncError = "Synchronisation mit Google Drive fehlgeschlagen, bitte erneut versuchen."

    // DB synchronization
    override val checkDBStatus = "Datenbankstatus wird überprüft..."
    override val checkDBStatusFinished = "Status erfolgreich überprüft. Datenbanksynchronisation wird gestartet..."
    override val syncDBFinished = "Datenbanksynchronisation erfolgreich abgeschlossen!"
    override val downloadingDB = { table: String ->
        "Tabelle $table wird heruntergeladen..."
    }
    override val downloadedDB = { table: String ->
        "Tabelle $table erfolgreich heruntergeladen"
    }
    override val uploadingDB = { table: String ->
        "Tabelle $table wird hochgeladen..."
    }
    override val uploadedDB = { table: String ->
        "Tabelle $table erfolgreich hochgeladen"
    }
    override val syncingDB = { table: String ->
        "Tabelle $table wird synchronisiert..."
    }
    override val syncedDB = { table: String ->
        "Tabelle $table erfolgreich synchronisiert"
    }

    // Pic synchronization
    override val checkPicStatus = "Bildstatus wird überprüft..."
    override val checkPicStatusFinished = "Status erfolgreich überprüft. Bildersynchronisation wird gestartet..."
    override val syncPicFinished = "Bildersynchronisation erfolgreich abgeschlossen!"
    override val downloadingPic = { earTag: String ->
        "Bilder des Tiers $earTag werden heruntergeladen..."
    }
    override val downloadedPic = { earTag: String ->
        "Bilder des Tiers $earTag erfolgreich heruntergeladen"
    }
    override val uploadingPic = { earTag: String ->
        "Bilder des Tiers $earTag werden hochgeladen..."
    }
    override val uploadedPic = { earTag: String ->
        "Bilder des Tiers $earTag erfolgreich hochgeladen"
    }
    override val syncingPic = { earTag: String ->
        "Bilder des Tiers $earTag werden synchronisiert..."
    }
    override val syncedPic = { earTag: String ->
        "Bilder des Tiers $earTag erfolgreich synchronisiert"
    }

    // Settings
    override val settingsChooseModes = "Was möchten Sie mit Manexp verwalten?"
    override val general = "Allgemein"
    override val enableMasterPassword = "Master-Passwort aktivieren. Dieses Passwort schützt alle Administrator-Einstellungen vor unbefugter Bearbeitung. Es entsperrt alle passwortgeschützten Bereiche der App."
    override val pdfRestricted = "PDF-Export einschränken. Diese Einstellung schützt den PDF-Export durch ein Passwort. Wenn ein Benutzer ein PDF in einem eingeschränkten Modus erstellen möchte, wird er nach dem Moduspasswort oder dem Master-Passwort gefragt."
    override val enablePassword = "Passwort aktivieren"
    override val password = "Passwort"
    override val loadSettings = "Einstellungen werden geladen..."
    override val invalidSettings = { errorMessage: String ->
        "Ungültige Einstellungen: $errorMessage"
    }
    override val masterPasswordRequired = "Master-Passwort erforderlich"
    override val livestockPasswordRequired = "Passwort für Viehbestand erforderlich"
    override val minimumOneNecklaceRequired = "Sie müssen mindestens ein Halsband haben"
    override val milkingPasswordRequired = "Passwort für Melken erforderlich"
    override val minimumOneMilkingPositionRequired = "Sie müssen mindestens eine Melkposition haben"
    override val outingsPasswordRequired = "Passwort für Ausgänge erforderlich"
    override val fieldsPasswordRequired = "Passwort für Felder erforderlich"
    override val noSettings = "Keine Einstellungen gefunden"
    override val passwordValidity = "Wählen Sie die Freischaltungsdauer in Minuten nach Eingabe eines Passworts. Dieser Wert legt fest, wie lange der Benutzer auf den entsperrten Bereich zugreifen kann, bevor er erneut ein Passwort eingeben muss."
    override val atLeastOneMode = "Mindestens ein Modus muss ausgewählt werden"

    // Password
    override val noPassword = "Kein Passwort"
    override val wrongPassword = "Falsches Passwort"
    override val unlockMode = { mode: String, minutes: Int ->
        "$mode für $minutes Minuten entsperren"
    }
    override val admin = "Admin"
    override val restrictMode = { mode: String ->
        "$mode-Modus mit einem Passwort schützen. Dies beschränkt die Bearbeitung, nicht jedoch die Ansicht. Jeder Benutzer kann Informationen sehen, aber nicht ohne Passwort bearbeiten."
    }

    // Camera
    override val flashNotSupported = "Blitz wird nicht unterstützt"
    override val head = "Kopfaufnahme"
    override val rightSide = "Rechte Seitenaufnahme"
    override val leftSide = "Linke Seitenaufnahme"
    override val noPictures = "Keine Bilder verfügbar."
    override val picturesDate = { date: String ->
        "Bilder aufgenommen am $date"
    }
    override val warningDeleteTitle = "Löschen bestätigen"
    override val warningDeleteMessage = "Sind Sie sicher, dass Sie dieses Element löschen möchten? Dieser Vorgang kann nicht rückgängig gemacht werden."

    // Livestock
    override val addAnimal = "Beginnen Sie mit dem Hinzufügen eines Tiers"
    override val agateImport = "Tiere aus Agate importieren"
    override val agateImportMessage = "Gehen Sie zur Agate-Website, holen Sie die Excel-Datei mit Ihren Viehbestandsdaten und wählen Sie sie unten aus"
    override val agateImportInformation = "Nur Tiere mit gültigem Namen und nicht bereits in Manexp vorhanden werden importiert"
    override val importExcel = "Excel-Datei importieren"
    override val validatePreview = "Überprüfen Sie vor der Bestätigung, ob die Daten der richtigen Spalte zugeordnet und korrekt formatiert sind"
    override val notExcelFile = "Ausgewählte Datei ist keine Excel-Datei"
    override val invalidExcelFile = "Tiere konnten nicht aus Datei importiert werden. Falls das Problem weiterhin besteht, reichen Sie bitte ein Ticket mit der Excel-Datei ein."
    override val profile = "Profil"
    override val necklaceNumber = "Halsbandnummer"
    override val allAnimalsNecklaced = "Allen Tieren ein Halsband erlauben. Diese Einstellung definiert, ob auch Männchen und Jungtiere ein Halsband haben dürfen."
    override val searchAnimal = "Tier suchen"
    override val sortName = "Nach Name sortieren"
    override val sortEarTag = "Nach Ohrmarke sortieren"
    override val sortBirthDate = "Nach Geburtsdatum sortieren"
    override val sortNecklace = "Nach Halsband sortieren"
    override val add = "Hinzufügen"
    override val earTag = "Ohrmarke"
    override val name = "Name"
    override val sex = "Geschlecht"
    override val arrivalDate = "Ankunftsdatum"
    override val birthDate = "Geburtsdatum"
    override val selectSex = "Geschlecht wählen"
    override val noEarTag = "Keine oder ungültige Ohrmarke"
    override val noName = "Kein Name eingetragen"
    override val noSex = "Kein Geschlecht ausgewählt"
    override val noArrivalDate = "Kein Ankunftsdatum ausgewählt"
    override val noBirthDate = "Kein Geburtsdatum ausgewählt"
    override val departureDate = "Abgangsdatum"
    override val animalDeparted = "Das Tier ist als abgegangen markiert. Fügen Sie es erneut hinzu, um Aktionen durchzuführen."
    override val invalidDate = "Ungültiges Datum"
    override val noDepartureDate = "Kein Abgangsdatum ausgewählt"
    override val noAnimal = "Kein Tier ausgewählt"

    // Dairy
    override val addDairies = "Fügen Sie zuerst Milchkühe hinzu, bevor Sie melken. Gehen Sie dazu zu Viehbestand und klicken Sie auf die Tiere, die Sie melken möchten. Sie werden durch die Erstellung Ihrer ersten Milchkühe geführt."
    override val addAsDairy = "Dieses Tier zu Milchkühen hinzufügen"
    override val animalIsValidDairy = "Dieses Tier erfüllt die Bedingungen, um eine Milchkuh zu sein. Möchten Sie es hinzufügen?"
    override val noBeginningProductionDate = "Kein Produktionsbeginn-Datum ausgewählt"
    override val warningActiveDairyTitle = "Aktive Milchkuh"
    override val warningActiveDairyMessage = "Dieses Tier ist eine aktive Milchkuh. Sind Sie sicher, dass Sie es entfernen möchten? Wenn Sie weitermachen, wird es deaktiviert."
    override val calvingDate = "Abkalbedatum"
    override val noCalvingDate = "Kein Abkalbedatum ausgewählt"
    override val dryDate = "Trockenstellungsdatum"
    override val noDryDate = "Kein Trockenstellungsdatum ausgewählt"
    override val dairyTriggerFailed = "Aktualisierung der Milchkühe fehlgeschlagen. Seite neu laden. Wenn das Problem bleibt, melden Sie bitte einen Fehler."

    // Lactations
    override val lactations = "Laktationen"
    override val lactation = "Laktation"
    override val lactationNumber = { number: Int ->
        "Laktation $number"
    }
    override val beginningLactationDate = "Abkalbedatum"
    override val endLactationDate = "Trockenstellungsdatum"
    override val noEndLactationDate = "Kein Trockenstellungsdatum"
    override val addCalving = "Abkalben"
    override val addDried = "Trockenstellen"

    // Treatment
    override val selectedNumber = { selected: Int, total: Int ->
        "Ausgewählte Tiere: $selected/$total"
    }
    override val treatments = "Behandlungen"
    override val treatment = "Behandlung"
    override val noTreatment = "Keine Behandlung eingetragen"
    override val medicine = "Medikament"
    override val noMedicine = "Kein Medikament eingetragen"
    override val dosage = "Dosierung"
    override val noDosage = "Keine Dosierung eingetragen"
    override val beginningTreatmentDate = "Behandlungsbeginn"
    override val noBeginningTreatmentDate = "Kein Behandlungsbeginn ausgewählt"
    override val endTreatmentDate = "Behandlungsende"
    override val noEndTreatmentDate = "Kein Behandlungsende ausgewählt"
    override val period = "Zeitraum"
    override val periodValue = { value: Int -> "$value Tage" }
    override val milkReleaseDate = "Milchfreigabe"
    override val noMilkReleaseDate = "Keine Milchfreigabe ausgewählt"
    override val meatReleaseDate = "Fleischfreigabe"
    override val noMeatReleaseDate = "Keine Fleischfreigabe ausgewählt"
    override val additionalInformation = "Zusätzliche Informationen"
    override val inProduction = "in Produktion gehalten"
    override val keepInProduction = "In Produktion halten"
    override val rightFrontTeatTreated = "Rechte vordere Zitze behandelt"
    override val rightFrontTeat = "Rechte vordere Zitze"
    override val leftFrontTeatTreated = "Linke vordere Zitze behandelt"
    override val leftFrontTeat = "Linke vordere Zitze"
    override val rightRearTeatTreated = "Rechte hintere Zitze behandelt"
    override val rightRearTeat = "Rechte hintere Zitze"
    override val leftRearTeatTreated = "Linke hintere Zitze behandelt"
    override val leftRearTeat = "Linke hintere Zitze"
    override val confirmRemoveTreatmentTitle = "Behandlung entfernen"
    override val confirmRemoveTreatmentMessage = "Sind Sie sicher, dass Sie diese Behandlung entfernen möchten? Dies kann nicht rückgängig gemacht werden."
    override val treatmentTriggerFailed = "Aktualisierung der Behandlungen fehlgeschlagen. Seite neu laden. Wenn das Problem bleibt, melden Sie bitte einen Fehler."
    override val sickTitle = "Krankes Tier"
    override val sickNoProductionMessage = "Dieses Tier ist krank und die Milch ist nicht für den Konsum geeignet. Nicht in Produktion setzen."
    override val sickProductionMessage = "Zitzen, die nicht in Produktion gesetzt werden dürfen:"

    // Milking
    override val datedMilkProduction = { date: String ->
        "Milchproduktion um $date"
    }
    override val partOfDayMilkProduction = { partOfDay: String, value: String ->
        "Milchproduktion für ${partOfDay.lowercase()}: $value kg"
    }
    override val totalMilkProduction = { value: String ->
        "Ganze Milchproduktion: $value kg"
    }
    override val noMilkProduction = "Für diesen Tag keine Milchproduktion verfügbar"
    override val dairyProfile = "Milchkuhprofil"
    override val leftMilkingPositions = "Linke Melkpositionen"
    override val rightMilkingPositions = "Rechte Melkpositionen"
    override val beginningProductionDate = "Produktionsbeginn"
    override val retirementDate = "Abgangsdatum"
    override val milkCycle = "Milchzyklus"
    override val inactiveDairy = "Inaktive Milchkuh"
    override val calvingTitle = "Frisch abgekalbt"
    override val calvingMessage = "Dieses Tier hat frisch abgekalbt. Milch nicht in Produktion setzen."
    override val alreadySelected = "Milchkuh bereits ausgewählt."
    override val alreadyMilkedTitle = "Tier bereits gemolken"
    override val alreadyMilkedMessage = "Möchten Sie zur Statistikseite wechseln?"
    override val milkProductionError = "Produktion konnte nicht registriert werden. Bitte Eingaben überprüfen. Wenn das Problem bleibt, melden Sie einen Fehler."
    override val nothingToSave = "Keine gültigen Positionen. Prüfen Sie, ob mindestens eine Position ein Tier und einen gültigen Produktionswert enthält."
    override val selectMilkProductionDayTitle = "Milchproduktionsübersicht generieren"
    override val selectMilkProductionDayEntry = "Produktionstag wählen"
    override val noMilkProductionDate = "Kein Produktionstag ausgewählt"
    override val milkProductionPDF = { date: String ->
        "milchproduktion_$date.pdf"
    }
    override val mean = { partOfDay: String, value: String ->
        "Durchschnitt der letzten 10 $partOfDay-Melkungen:\n $value kg"
    }
    override val deviation = { value: String ->
        "Abweichung vom Durchschnitt:\n $value%"
    }
    override val milkedValue = "Aktuelle Produktion (kg):"

    // Milk cycles
    override val production = "Produktion"
    override val dried = "Trocken"
    override val calving = "Abkalben"
    override val selectMilkCycle = "Milchzyklus wählen"
    override val noMilkCycle = "Kein Milchzyklus ausgewählt"

    // Countries
    override val switzerland = "Schweiz"

    // Property status
    override val owner = "Eigentümer"
    override val lodger = "Pächter"
    override val other = "Andere"

    // Sex
    override val male = "Männlich"
    override val female = "Weiblich"

    // parts of day
    override val morning = "Morgen"
    override val evening = "Abend"
    override val total = "Total"
    override val totalProduction = "Gesamt"
    override val kilograms = "Kilogramm"
    override val kg = "kg"
    override val beginning = "Beginn"
    override val end = "Ende"
    override val displayedProduction = { value: String ->
        "Angezeigte Produktion: $value kg"
    }
    override val dayNumber = { value: Int ->
        "$value Tage"
    }
    override val d305 = "305-Tage-Filter"

    // Outings
    override val courtyard = "Hof"
    override val courtyardLetter = "H"
    override val pasture = "Weide"
    override val pastureLetter = "W"
    override val badWeather = "Schlechtes Wetter"
    override val badWeatherLetter = "S"
    override val notDefined = "Nicht definiert"
    override val notDefinedLetter = "N"
    override val paused = "Pausiert"
    override val modifyGlobal = "Global ändern"
    override val modifyDay = { date: String ->
        "$date ändern"
    }
    override val outingsPDFTitle = { year: Int ->
        "Ausgangskalender $year"
    }
    override val outingsPDFName = { year: Int ->
        "ausgangskalender_$year.pdf"
    }

    // Outing groups
    override val addGroup = "Beginnen Sie mit dem Hinzufügen von Ausgangsgruppen"
    override val groupName = "Gruppenname"
    override val cows = "Kühe"
    override val maxTenCharacters = "Name ist auf 10 Zeichen ohne Leerzeichen begrenzt"
    override val nameAlreadyExists = "Name existiert bereits"

    // Fields
    override val searchFields = "Felder finden"
    override val sortSurface = "Nach Fläche sortieren"
    override val sortProperty = "Nach Eigenschaft sortieren"
    override val sortNumber = "Nach Nummer sortieren"
    override val sortID = "Nach Identifikator sortieren"
    override val sortMunicipality = "Nach Gemeinde sortieren"
    override val sortCanton = "Nach Kanton sortieren"
    override val fetchLandData = "Plotdaten werden abgerufen..."
    override val zoomInFirst = "Vergrößern Sie die Ansicht, bevor Sie einen Plot auswählen"
    override val noLandData = "Keine Paketdaten gefunden. Wenn der Fehler weiterhin besteht, wenden Sie sich an den Entwickler."
    override val importLand = "Diesen Plot importieren?"
    override val landId = { id: String? ->
        if (id != null) {
            "Identifikator: $id"
        } else {
            "Identifikator"
        }
    }
    override val number = { number: String? ->
        if (number != null) {
            "Nummer: $number"
        } else {
            "Nummer"
        }
    }
    override val surface = { surface: String? ->
        if (surface != null) {
            "Fläche: $surface Hektar"
        } else {
            "Fläche"
        }
    }
    override val municipality = { municipality: String? ->
        if (municipality != null) {
            "Gemeinde: $municipality"
        } else {
            "Gemeinde"
        }
    }
    override val municipalityNumber = {number: String? ->
        if (number != null) {
            "Gemeinde-Nummer: $number"
        } else {
            "Gemeinde-Nummer"
        }
    }
    override val canton = { canton: String? ->
        if (canton != null) {
            "Kanton: $canton"
        } else {
            "Kanton"
        }
    }
    override val country = { country: String? ->
        if (country != null) {
            "Land: $country"
        } else {
            "Land"
        }
    }
    override val landPDF = { link: String? ->
        if (link != null) {
            "Parzellen-PDF: $link"
        } else {
            "Parzellen-PDF"
        }
    }
    override val landLink = { link: String? ->
        if (link != null) {
            "Parzellenlink: $link"
        } else {
            "Parzellenlink"
        }
    }
    override val cadastreAddress = { address: String? ->
        if (address != null) {
            "Katasteradresse: $address"
        } else {
            "Katasteradresse"
        }
    }
    override val cadastrePostalCode = { code: String? ->
        if (code != null) {
            "Postleitzahl des Katasters: $code"
        } else {
            "Postleitzahl des Katasters"
        }
    }
    override val cadastreMunicipality = { municipality: String? ->
        if (municipality != null) {
            "Katastergemeinde: $municipality"
        } else {
            "Katastergemeinde"
        }
    }
    override val cadastreEmail = { email: String? ->
        if (email != null) {
            "E-Mail des Katasters: $email"
        } else {
            "E-Mail des Katasters"
        }
    }
    override val cadastrePhone = { phone: String? ->
        if (phone != null) {
            "Telefon des Katasters: $phone"
        } else {
            "Telefon des Katasters"
        }
    }
    override val cadastreLink = { link: String? ->
        if (link != null) {
            "Kataster-Website: $link"
        } else {
            "Kataster-Website"
        }
    }
    override val propertyStatus = { status: String? ->
        if (status != null) {
            "Eigentumsstatus: $status"
        } else {
            "Eigentumsstatus"
        }
    }
    override val landName = "Grundstücksname"
    override val land = "Grundstück"
    override val cadastre = "Kataster"
    override val selectProperty = "Status wählen"
    override val invalidLandData = "Füllen Sie alle erforderlichen Felder aus, bevor Sie dieses Paket speichern."

    // Location
    override val noLocation = "Standort ausstehend, nicht verfügbar oder Zugriff verweigert"

    // unknown
    override val unknown = "Unbekannt"

    // migration1
    override val Migration1ErrorNoContent = "❌ Fehler beim Abrufen alter Daten, Inhalt leer. ❌"
    override val Migration1ErrorMalformedEntry = "❌ Einige fehlerhafte Daten werden übersprungen. Bitte Entwickler kontaktieren, um das Problem zu lösen ❌"
    override val Migration1MigrateMilkProductionTitle = "Milchproduktionsmigration"
    override val Migration1MigrateMilkProductionStart = "Migration der Milchproduktion wird gestartet..."
    override val Migration1MigrateMilkProductionStatus = { actualValue: Int, totalValue: Int ->
        "Tier $actualValue/$totalValue wird migriert..."
    }
    override val Migration1MigrateMilkProductionSuccess = "✅ Milchproduktion erfolgreich migriert ✅"
}