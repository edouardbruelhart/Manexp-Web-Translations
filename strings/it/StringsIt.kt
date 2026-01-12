package resources.strings.it

import helpers.DeviceInformation
import resources.strings.Strings

object StringsIt : Strings {

    // welcome
    override val welcomeMessage = "Benvenuto in Manexp!"
    override val setupMessage = "Per iniziare, connettiti al tuo account Google, poi clicca su Sincronizza. Puoi anche scaricare l'applicazione sul tuo dispositivo."
    override val iosDevice = "Rilevato dispositivo iOS. Puoi installare l'app usando Safari cliccando su \"Condividi\" (quadrato con freccia verso l'alto) e \"Aggiungi a Home\"."
    override val connectToRegister = "La connessione di rete è richiesta durante la registrazione. Attivala per continuare."
    override val manexpDescription = "Monitora e gestisci la tua azienda con facilità — anche offline."
    override val footer = { version: String ->
        "Versione $version • Hai bisogno di aiuto? Contatta edouard.brulhart@manexp.ch"
    }

    // Login
    override val loginSuccess = "Accesso riuscito!"
    override val deviceDeleted = "Dispositivo eliminato"
    override val unknownError = "Errore sconosciuto"
    override val noInternet = "Nessuna connessione a Internet. Connettiti a Internet e ricarica l'app."
    override val connectingToGoogle = "Connessione a Google..."

    // Import data
    override val importMessage = "Importa dati da un altro account Google"
    override val importDescription = "Scarica prima la cartella manexp_data dal Google Drive del vecchio account Google sul tuo dispositivo. Poi selezionala con il selettore qui sotto e conferma con il pulsante di upload."
    override val importWarning = "Non eseguire questa operazione se hai già dati importanti in questo account Google. La cartella manexp_data verrà interamente sostituita da quella selezionata."
    override val importInProgress = "Caricamento in corso, per favore non aggiornare la pagina..."
    override val folderReadError = "Impossibile leggere la cartella selezionata"
    override val notManexpFolder = "La cartella selezionata non corrisponde ai dati Manexp"
    override val uploadError = "Impossibile caricare la cartella, riprova più tardi."

    // Development
    override val devModeOff = "Modalità sviluppo disabilitata"
    override val devModeOn = "Modalità sviluppo abilitata"
    override val featureInDevelopment = "Questa funzionalità è in fase di sviluppo. Pertanto, potrebbe presentare bug, modifiche o rimozioni."

    // Error Page
    override val errorOccurred = "Si è verificato un errore:"
    override val reconnect = "Riconnetti"
    override val reloadApp = "Ricarica l'app"

    // date
    override val date = "Data"

    // months
    override val january = "Gennaio"
    override val february = "Febbraio"
    override val march = "Marzo"
    override val april = "Aprile"
    override val may = "Maggio"
    override val june = "Giugno"
    override val july = "Luglio"
    override val august = "Agosto"
    override val september = "Settembre"
    override val october = "Ottobre"
    override val november = "Novembre"
    override val december = "Dicembre"

    // days
    override val monday = "Lunedì"
    override val mon = "Lun."
    override val tuesday = "Martedì"
    override val tue = "Mar."
    override val wednesday = "Mercoledì"
    override val wed = "Mer."
    override val thursday = "Giovedì"
    override val thu = "Gio."
    override val friday = "Venerdì"
    override val fri = "Ven."
    override val saturday = "Sabato"
    override val sat = "Sab."
    override val sunday = "Domenica"
    override val sun = "Dom."

    // incompatible browser
    override val incompatibleBrowserPWA = "Questo browser non supporta l'installazione dell'applicazione. Si consiglia di usare un altro browser per un'esperienza ottimale."
    override val incompatibleBrowserDB = "Questo browser non supporta la gestione del database. Usa un altro browser."

    // installation
    override val installButton = "Installa l'app"
    override val connectButton = "Connesso a Google"
    override val connectionError = "Connessione a Google fallita, riprova."
    override val otherAccountError = "Account memorizzato e account selezionato sono diversi. Seleziona l'account corretto."
    override val synchronizeButton = "Sincronizza"
    override val manualImportButton = "Importa dati"
    override val cannotInstall = "Usa un altro browser per installare l'applicazione."
    override val installed = "Applicazione installata"

    // pages
    override val manexpPage = "Manexp"
    override val home = "Home"
    override val milking = "Mungitura"
    override val livestock = "Bestiame"
    override val outings = "Uscite"
    override val fields = "Campi"

    // Network
    override val noNetwork = "Non sei connesso alla rete!"

    // Database
    override val updateSuccess = "Database aggiornato con successo!"
    override val updateError = "Aggiornamento database fallito, riprova."
    override val pictureStorageError = "Salvataggio immagine fallito."

    // Information panel
    override val settings = "Impostazioni"
    override val about = "Informazioni"
    override val contact = "Contatto"
    override val contactDev = "Manexp: Contatta lo sviluppatore"
    override val termsOfUse = "Termini d'uso"
    override val bugReport = "Segnala un bug"
    override val reportSubject = "Manexp: Segnala un bug"
    override val reportBody = { version: String, build: String, device: DeviceInformation ->
        "Descrizione del bug:\n(Esempio: Il calendario uscite si chiude quando si accede al conceptor)\n\n\n" +
                "Passi per riprodurre il bug:\n(Esempio:\n1. Apri il calendario uscite\n2. Apri il conceptor\n3. L'app si chiude)\n\n\n" +
                "Comportamento atteso:\n(Esempio: L'app dovrebbe mostrare i gruppi per poterli spostare.)\n\n\n" +
                "Contesto aggiuntivo:\n(Esempio: Si verifica solo al mattino)\n\n\n" +
                "Versione: $version\nBuild: $build\nDispositivo: $device"
    }
    override val newFeature = "Richiedi una nuova funzionalità"
    override val newFeatureSubject = "Manexp: Richiesta nuova funzionalità"
    override val newFeatureBody = "Descrizione della nuova funzionalità:\n(Esempio: Creare una nuova modalità per gestire parti e inseminazioni\n\n\n" +
            "Nome e cognome:\n\n\n" +
            "Numero di telefono:\n\n\n"
    override val debugger = "Apri console di debug"

    // Necklace management
    override val necklace = { number: Int ->
        "Collare $number"
    }
    override val noLinkedNecklace = "Nessun collare collegato."
    override val necklaceNotLinked = "Nessun animale collegato o animale non compatibile"
    override val linkNecklace = "Collega"
    override val selectNecklace = "Seleziona il collare da collegare all'animale"
    override val necklaceAlreadyAttributed = "Questo collare è già assegnato."
    override val warningLinkedNecklaceTitle = "Collare collegato"
    override val warningLinkedNecklaceMessage = "Questo animale è assegnato a un collare. Sei sicuro di volerlo rimuovere? Se accetti, il collegamento verrà rimosso."
    override val necklaceQuantity = "Quantità collari"

    // Device
    override val noDevice = "Nessun dispositivo trovato"
    override val linkedDevices = "Dispositivi collegati"
    override val browser = "Browser"
    override val vendor = "Produttore"
    override val model = "Modello"
    override val type = "Tipo"
    override val platform = "Piattaforma"
    override val lastSeen = "Ultimo accesso"
    override val unlinkDeviceTitle = "Scollega dispositivo"
    override val unlinkDeviceMessage = "Sei sicuro di voler scollegare questo dispositivo?"
    override val unlinkDeviceFailed = "Scollegamento dispositivo fallito"
    override val unlinkOwnDeviceTitle = "Scollega questo dispositivo"
    override val unlinkOwnDeviceMessage = "Stai per scollegare il tuo dispositivo. Sei sicuro di voler procedere?"
    override val necklaceNotAllowed = "Il collegamento a un collare è riservato agli animali da latte. Se desideri permettere l'aggiunta a tutti gli animali, vai nelle impostazioni e modifica la preferenza."

    // Version
    override val validity = "Validità"
    override val version = "Versione"
    override val build = "Build"

    // confirm/cancel
    override val confirm = "Conferma"
    override val cancel = "Annulla"
    override val clear = "Cancella"
    override val modify = "Modifica"

    // new version
    override val newVersion = "Nuova versione installata"

    // terms
    override val terms = "/terms/terms_of_use_it.html"

    // Test version
    override val trialFinished = "Periodo di prova terminato"
    override val getPaidVersion = "Ottieni la versione a pagamento"
    override val getPaidSubject = "Richiesta versione a pagamento"
    override val getPaidBody = "Grazie per usare Manexp! Per accedere alla versione a pagamento, " +
            "compila le seguenti informazioni e ti contatterò al più presto:" +
            "\n\nNome e cognome:\nNumero di telefono:\nCantone di residenza:\nIndirizzo:\nAttività della tua azienda:"
    override val unlimited = "Illimitato"

    // General
    override val none = "Nessuno"
    override val yes = "Sì"
    override val no = "No"
    override val to = "a"
    override val legend = { period: String ->
        "Deviazione di produzione rispetto alla media di $period mungiture degli ultimi dieci giorni"
    }
    override val noData = "Nessun dato disponibile"
    override val generatePDF = "Genera PDF"
    override val loading = "Caricamento..."

    // Global synchronization
    override val synchronize = "Sincronizzazione con Google Drive"
    override val askSynchronize = "Vuoi sincronizzare con Google Drive?"
    override val syncMessage = "Sincronizzazione con Google Drive in corso, non chiudere la pagina..."
    override val databaseSynchronization = "Sincronizzazione database"
    override val picturesSynchronization = "Sincronizzazione immagini"
    override val syncSuccess = "Sincronizzazione con Google Drive riuscita!"
    override val syncError = "Sincronizzazione con Google Drive fallita, riprova."

    // DB synchronization
    override val checkDBStatus = "Controllo stato database..."
    override val checkDBStatusFinished = "Stato controllato correttamente. Procedo con la sincronizzazione del database..."
    override val syncDBFinished = "Sincronizzazione del database completata con successo!"
    override val downloadingDB = { table: String ->
        "Download tabella $table..."
    }
    override val downloadedDB = { table: String ->
        "Tabella $table scaricata con successo"
    }
    override val uploadingDB = { table: String ->
        "Upload tabella $table..."
    }
    override val uploadedDB = { table: String ->
        "Tabella $table caricata con successo"
    }
    override val syncingDB = { table: String ->
        "Sincronizzazione tabella $table..."
    }
    override val syncedDB = { table: String ->
        "Tabella $table sincronizzata con successo"
    }

    // Pic synchronization
    override val checkPicStatus = "Controllo stato immagini..."
    override val checkPicStatusFinished = "Stato controllato correttamente. Procedo con la sincronizzazione delle immagini..."
    override val syncPicFinished = "Sincronizzazione immagini completata con successo!"
    override val downloadingPic = { earTag: String ->
        "Download immagini dell'animale $earTag..."
    }
    override val downloadedPic = { earTag: String ->
        "Immagini dell'animale $earTag scaricate con successo"
    }
    override val uploadingPic = { earTag: String ->
        "Upload immagini dell'animale $earTag..."
    }
    override val uploadedPic = { earTag: String ->
        "Immagini dell'animale $earTag caricate con successo"
    }
    override val syncingPic = { earTag: String ->
        "Sincronizzazione immagini dell'animale $earTag..."
    }
    override val syncedPic = { earTag: String ->
        "Immagini dell'animale $earTag sincronizzate con successo"
    }

    // Settings
    override val settingsChooseModes = "Cosa vuoi gestire con Manexp?"
    override val general = "Generale"
    override val enableMasterPassword = "Abilita password master. Questa password protegge tutte le impostazioni amministrative da modifiche non autorizzate. Sbloccherà tutte le aree protette da password all'interno dell'app."
    override val pdfRestricted = "Restringi esportazione PDF. Questa impostazione protegge la generazione PDF con una password. Quando un utente vuole generare un PDF in una modalità che è limitata, gli verrà richiesto di inserire la password della modalità o la password master"
    override val enablePassword = "Abilita password"
    override val password = "Password"
    override val loadSettings = "Caricamento impostazioni..."
    override val invalidSettings = { errorMessage: String ->
        "Impostazioni non valide: $errorMessage"
    }
    override val masterPasswordRequired = "Password master richiesta"
    override val livestockPasswordRequired = "Password bestiame richiesta"
    override val minimumOneNecklaceRequired = "Devi avere almeno un collare"
    override val milkingPasswordRequired = "Password mungitura richiesta"
    override val minimumOneMilkingPositionRequired = "Devi avere almeno una posizione di mungitura"
    override val outingsPasswordRequired = "Password uscite richiesta"
    override val fieldsPasswordRequired = "Password campi richiesta"
    override val noSettings = "Nessuna impostazione trovata"
    override val passwordValidity = "Seleziona la durata di sblocco in minuti dopo l'inserimento della password. Questo valore definirà il tempo durante il quale l'utente potrà usare l'area sbloccata prima che venga richiesto di inserire nuovamente la password."
    override val atLeastOneMode = "Devi selezionare almeno una modalità"

    // Password
    override val noPassword = "Nessuna password"
    override val wrongPassword = "Password errata"
    override val unlockMode = { mode: String, minutes: Int ->
        "Sblocca $mode per $minutes minuti"
    }
    override val admin = "Admin"
    override val restrictMode = { mode: String ->
        "Restringi la modalità $mode con una password. Questo limiterà la modifica, non la visualizzazione. Ciò significa che ogni utente potrà vedere le informazioni, ma non modificarle senza password."
    }

    // Camera
    override val flashNotSupported = "Il flash non è supportato"
    override val head = "Foto della testa"
    override val rightSide = "Foto lato destro"
    override val leftSide = "Foto lato sinistro"
    override val noPictures = "Nessuna immagine disponibile."
    override val picturesDate = { date: String ->
        "Immagini scattate il $date"
    }
    override val warningDeleteTitle = "Conferma eliminazione"
    override val warningDeleteMessage = "Sei sicuro di voler eliminare questo elemento? Questa operazione non può essere annullata."

    // Livestock
    override val addAnimal = "Inizia aggiungendo un animale"
    override val agateImport = "Importa animali da Agate"
    override val agateImportMessage = "Vai al sito Agate, ottieni il file excel contenente le informazioni del bestiame e selezionalo qui sotto"
    override val agateImportInformation = "Verranno importati solo gli animali con un nome valido e assenti in Manexp"
    override val importExcel = "Importa file Excel"
    override val validatePreview = "Prima della conferma, controlla che i dati siano associati alla colonna corretta e formattati correttamente"
    override val notExcelFile = "Il file selezionato non è un file Excel"
    override val invalidExcelFile = "Impossibile importare gli animali dal file. Se il problema persiste, invia una segnalazione con il file Excel allegato."
    override val profile = "Profilo"
    override val necklaceNumber = "Numero collare"
    override val allAnimalsNecklaced = "Permetti collare a tutti gli animali. Questa impostazione definisce se anche maschi e giovani possono essere collegati a un collare."
    override val searchAnimal = "Cerca un animale"
    override val sortName = "Ordina per nome"
    override val sortEarTag = "Ordina per orecchino"
    override val sortBirthDate = "Ordina per data di nascita"
    override val sortNecklace = "Ordina per collare"
    override val add = "Aggiungi"
    override val earTag = "Orecchino"
    override val name = "Nome"
    override val sex = "Sesso"
    override val arrivalDate = "Data di arrivo"
    override val birthDate = "Data di nascita"
    override val selectSex = "Seleziona sesso"
    override val noEarTag = "Nessun orecchino o orecchino non valido"
    override val noName = "Nessun nome inserito"
    override val noSex = "Nessun sesso selezionato"
    override val noArrivalDate = "Nessuna data di arrivo selezionata"
    override val noBirthDate = "Nessuna data di nascita selezionata"
    override val departureDate = "Data di partenza"
    override val animalDeparted = "L'animale è segnato come partito. Reinseriscilo per eseguire operazioni su di esso."
    override val invalidDate = "Data non valida"
    override val noDepartureDate = "Nessuna data di partenza selezionata"
    override val noAnimal = "Nessun animale inserito"

    // Dairy
    override val addDairies = "Aggiungi animali da latte prima di mungere. Vai a Bestiame e clicca sugli animali che vuoi mungere. Verrai guidato per creare i tuoi primi animali da latte."
    override val addAsDairy = "Aggiungi questo animale agli animali da latte"
    override val animalIsValidDairy = "Questo animale soddisfa le condizioni per essere un animale da latte. Vuoi aggiungerlo?"
    override val noBeginningProductionDate = "Nessuna data di inizio produzione selezionata"
    override val warningActiveDairyTitle = "Animale da latte attivo"
    override val warningActiveDairyMessage = "Questo animale è un animale da latte attivo. Sei sicuro di volerlo rimuovere? se continui, verrà disattivato."
    override val calvingDate = "Data del parto"
    override val noCalvingDate = "Nessuna data del parto selezionata"
    override val dryDate = "Data asciutta"
    override val noDryDate = "Nessuna data asciutta selezionata"
    override val dairyTriggerFailed = "Impossibile aggiornare gli animali da latte. Prova a ricaricare la pagina. Se il problema persiste, segnala un bug."

    // Lactations
    override val lactations = "Lattazioni"
    override val lactation = "lattazione"
    override val lactationNumber = { number: Int ->
        "lattazione $number"
    }
    override val beginningLactationDate = "Data del parto"
    override val endLactationDate: String = "Data inizio asciutta"
    override val noEndLactationDate: String = "Nessuna data asciutta"
    override val addCalving = "Parto"
    override val addDried = "Asciugamento"

    // Treatment
    override val selectedNumber = {selected: Int, total: Int ->
        "Animali selezionati: $selected/$total"
    }
    override val treatments = "Trattamenti"
    override val treatment = "Trattamento"
    override val noTreatment = "Nessun trattamento inserito"
    override val medicine = "Medicinale"
    override val noMedicine = "Nessun medicinale inserito"
    override val dosage = "Dosaggio"
    override val noDosage = "Nessun dosaggio inserito"
    override val beginningTreatmentDate = "Inizio trattamento"
    override val noBeginningTreatmentDate = "Nessuna data di inizio trattamento selezionata"
    override val endTreatmentDate = "Fine trattamento"
    override val noEndTreatmentDate = "Nessuna data di fine trattamento selezionata"
    override val period = "Periodo"
    override val periodValue = { value: Int -> "$value giorni" }
    override val milkReleaseDate = "Rilascio latte"
    override val noMilkReleaseDate = "Nessuna data rilascio latte selezionata"
    override val meatReleaseDate = "Rilascio carne"
    override val noMeatReleaseDate = "Nessuna data rilascio carne selezionata"
    override val additionalInformation = "Informazioni aggiuntive"
    override val inProduction = "mantenuto in produzione"
    override val keepInProduction = "Mantieni in produzione"
    override val rightFrontTeatTreated = "Tetta anteriore destra trattata"
    override val rightFrontTeat = "Tetta anteriore destra"
    override val leftFrontTeatTreated = "Tetta anteriore sinistra trattata"
    override val leftFrontTeat = "Tetta anteriore sinistra"
    override val rightRearTeatTreated = "Tetta posteriore destra trattata"
    override val rightRearTeat = "Tetta posteriore destra"
    override val leftRearTeatTreated = "Tetta posteriore sinistra trattata"
    override val leftRearTeat = "Tetta posteriore sinistra"
    override val confirmRemoveTreatmentTitle = "Rimuovi trattamento"
    override val confirmRemoveTreatmentMessage = "Sei sicuro di voler rimuovere questo trattamento? Questa azione non può essere annullata."
    override val treatmentTriggerFailed = "Impossibile aggiornare i trattamenti. Prova a ricaricare la pagina. Se il problema persiste, segnala un bug."
    override val sickTitle = "Animale malato"
    override val sickNoProductionMessage = "Questo animale è malato e il latte non è idoneo al consumo. Non metterlo in produzione."
    override val sickProductionMessage = "Tette trattate da non mettere in produzione:"

    // Milking
    override val datedMilkProduction = { date: String ->
        "Produzione di latte del $date"
    }
    override val partOfDayMilkProduction = { partOfDay: String, value: String ->
        "Produzione di latte del ${partOfDay.lowercase()}: $value kg"
    }
    override val totalMilkProduction = { value: String ->
        "Produzione totale di latte: $value kg"
    }
    override val noMilkProduction = "Nessuna produzione di latte disponibile per questo giorno"
    override val dairyProfile = "Profilo latte"
    override val leftMilkingPositions = "Postazioni di mungitura sinistre"
    override val rightMilkingPositions = "Postazioni di mungitura destre"
    override val beginningProductionDate = "Data inizio produzione"
    override val retirementDate = "Data ritiro"
    override val milkCycle = "Ciclo di mungitura"
    override val inactiveDairy = "Animale da latte inattivo"
    override val calvingTitle = "Appena partorito"
    override val calvingMessage = "Questo animale ha appena partorito. Non mettere il latte in produzione."
    override val alreadySelected = "Animale da latte già selezionato."
    override val alreadyMilkedTitle = "Animale già munto"
    override val alreadyMilkedMessage = "Vuoi andare alla pagina delle statistiche?"
    override val milkProductionError = "Registrazione della produzione fallita. Verifica i valori inseriti. Se il problema persiste, segnala un bug."
    override val nothingToSave = "Nessuna posizione valida. Verifica di avere almeno una posizione contenente un animale e un valore di produzione valido."
    override val selectMilkProductionDayTitle = "Genera riepilogo produzione latte"
    override val selectMilkProductionDayEntry = "Seleziona il giorno di produzione da generare"
    override val noMilkProductionDate = "Nessuna data di produzione selezionata"
    override val milkProductionPDF = { date: String ->
        "produzione_latte_$date.pdf"
    }
    override val mean = { partOfDay: String, value: String ->
        "Media ultime 10 $partOfDay produzioni:\n $value kg"
    }
    override val deviation = { value: String ->
        "Deviazione dalla media del valore corrente:\n $value%"
    }
    override val milkedValue = "Produzione effettiva (kg):"

    // Milk cycles
    override val production = "Produzione"
    override val dried = "Asciugato"
    override val calving = "Parto"
    override val selectMilkCycle = "Seleziona un ciclo di mungitura"
    override val noMilkCycle = "Nessun ciclo di mungitura selezionato"

    // Countries
    override val switzerland = "Svizzera"

    // Property status
    override val owner = "Proprietario"
    override val lodger = "Affittuario"
    override val other = "Altro"

    // Sex
    override val male = "Maschio"
    override val female = "Femmina"

    // parts of day
    override val morning = "Mattina"
    override val evening = "Sera"
    override val total = "Totale"
    override val totalProduction = "Generale"
    override val kilograms = "chilogrammi"
    override val kg = "kg"
    override val beginning = "Inizio"
    override val end = "Fine"
    override val displayedProduction = { value: String ->
        "Produzione mostrata: $value kg"
    }
    override val dayNumber = { value: Int ->
        "$value giorni"
    }
    override val d305 = "Filtro 305 giorni"

    // Outings
    override val courtyard = "Cortile"
    override val courtyardLetter = "C"
    override val pasture = "Pascolo"
    override val pastureLetter = "P"
    override val badWeather = "Maltempo"
    override val badWeatherLetter = "M"
    override val notDefined = "Non definito"
    override val notDefinedLetter = "N"
    override val paused = "In pausa"
    override val modifyGlobal = "Modifica globalmente"
    override val modifyDay = { date: String ->
        "Modifica $date"
    }
    override val outingsPDFTitle = { year: Int ->
        "Calendario uscite $year"
    }
    override val outingsPDFName = { year: Int ->
        "calendario_uscite_$year.pdf"
    }

    // Outing groups
    override val addGroup = "Inizia aggiungendo gruppi di uscita"
    override val groupName = "Nome gruppo"
    override val cows = "Mucche"
    override val maxTenCharacters = "Il nome è limitato a 10 caratteri senza spazi"
    override val nameAlreadyExists = "Il nome esiste già"

    // Fields
    override val searchFields = "Trova campi"
    override val sortSurface = "Ordina per superficie"
    override val sortProperty = "Ordina per tipo di proprietà"
    override val sortNumber = "Ordina per numero"
    override val sortID = "Ordina per ID"
    override val sortMunicipality = "Ordina per comune"
    override val sortCanton = "Ordina per cantone"
    override val fetchLandData = "Recupero dei dati del grafico in corso..."
    override val zoomInFirst = "Ingrandisci prima di selezionare un terreno"
    override val noLandData = "Nessun dato del pacco trovato. Se l'errore persiste, contatta lo sviluppatore."
    override val importLand = "Importare questa trama?"
    override val landId = { id: String? ->
        if (id != null) {
            "Identificativo: $id"
        } else {
            "Identificativo"
        }
    }
    override val number = { number: String? ->
        if (number != null) {
            "Numero: $number"
        } else {
            "Numero"
        }
    }
    override val surface = { surface: String? ->
        if (surface != null) {
            "Superficie: $surface ettari"
        } else {
            "Superficie"
        }
    }
    override val municipality = { municipality: String? ->
        if (municipality != null) {
            "Comune: $municipality"
        } else {
            "Comune"
        }
    }
    override val municipalityNumber = {number: String? ->
        if (number != null) {
            "Numero di comune: $number"
        } else {
            "Numero di comune"
        }
    }
    override val canton = { canton: String? ->
        if (canton != null) {
            "Cantone: $canton"
        } else {
            "Cantone"
        }
    }
    override val country = { country: String? ->
        if (country != null) {
            "Paese: $country"
        } else {
            "Paese"
        }
    }
    override val landPDF = { link: String? ->
        if (link != null) {
            "PDF della particella: $link"
        } else {
            "PDF della particella"
        }
    }
    override val landLink = { link: String? ->
        if (link != null) {
            "Link della particella: $link"
        } else {
            "Link della particella"
        }
    }
    override val cadastreAddress = { address: String? ->
        if (address != null) {
            "Indirizzo del catasto: $address"
        } else {
            "Indirizzo del catasto"
        }
    }
    override val cadastrePostalCode = { code: String? ->
        if (code != null) {
            "Codice postale del catasto: $code"
        } else {
            "Codice postale del catasto"
        }
    }
    override val cadastreMunicipality = { municipality: String? ->
        if (municipality != null) {
            "Comune del catasto: $municipality"
        } else {
            "Comune del catasto"
        }
    }
    override val cadastreEmail = { email: String? ->
        if (email != null) {
            "Email del catasto: $email"
        } else {
            "Email del catasto"
        }
    }
    override val cadastrePhone = { phone: String? ->
        if (phone != null) {
            "Telefono del catasto: $phone"
        } else {
            "Telefono del catasto"
        }
    }
    override val cadastreLink = { link: String? ->
        if (link != null) {
            "Sito del catasto: $link"
        } else {
            "Sito del catasto"
        }
    }
    override val propertyStatus = { status: String? ->
        if (status != null) {
            "Stato della proprietà: $status"
        } else {
            "Stato della proprietà"
        }
    }
    override val landName = "Nome del terreno"
    override val land = "Terreno"
    override val cadastre = "Catasto"
    override val selectProperty = "Seleziona lo stato"
    override val invalidLandData = "Completa tutti i campi obbligatori prima di salvare questo pacco."

    // Location
    override val noLocation = "Posizione in sospeso, non disponibile o accesso negato"

    // unknown
    override val unknown = "Sconosciuto"

    // migration1
    override val Migration1ErrorNoContent = "❌ Errore nel recupero dei vecchi dati, contenuto vuoto. ❌"
    override val Migration1ErrorMalformedEntry = "❌ Saltati alcuni dati malformati, contatta lo sviluppatore per correggerli ❌"
    override val Migration1MigrateMilkProductionTitle = "Migrazione produzione latte"
    override val Migration1MigrateMilkProductionStart = "Avvio migrazione produzione latte..."
    override val Migration1MigrateMilkProductionStatus = { actualValue: Int, totalValue: Int ->
        "Migrazione animale $actualValue/$totalValue..."
    }
    override val Migration1MigrateMilkProductionSuccess = "✅ Migrazione produzione latte completata con successo ✅"
}