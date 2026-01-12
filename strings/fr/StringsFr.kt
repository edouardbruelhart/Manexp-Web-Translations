package resources.strings.fr

import helpers.DeviceInformation
import resources.strings.Strings

object StringsFr : Strings {
    // welcomee
    override val welcomeMessage = "Bienvenue sur Manexp!"
    override val setupMessage = "Pour commencer, connectez-vous à votre compte Google, puis cliquez sur Synchroniser. Vous pouvez également télécharger l'application sur votre appareil."
    override val iosDevice = "Appareil IOS détecté. Vous pouvez installer l'application via Safari en cliquant sur \"Partager\" (carré avec une flèche vers le haut) puis \"Sur l'écran d'accueil\"."
    override val connectToRegister = "Une connection internet est requise durant l'enregistrement. Connectez-vous pour continuer."
    override val manexpDescription = "Suivez et contrôlez votre ferme avec facilité — Même hors ligne."
    override val footer = { version: String ->
        "Version $version • Besoin d'aide? Contactez edouard.brulhart@manexp.ch"
    }

    // Login
    override val loginSuccess = "Connexion réussie!"
    override val deviceDeleted = "Appareil supprimé"
    override val unknownError = "Erreur inconnue"
    override val noInternet = "Déconnecté d'internet. Connectez-vous à internet et rechargez l'application."
    override val connectingToGoogle = "Connexion à Google..."

    // Import data
    override val importMessage = "Importer des données depuis un autre compte google"
    override val importDescription = "Téléchargez d'abord le dossier manexp_data depuis le google drive de votre ancien compte google sur votre appareil. Ensuite, sélectionnez-le avec le sélecteur ci-dessous et confirmez avec le bouton de téléversement"
    override val importWarning = "Ne faites pas cette opération si vous avez déjà des données importantes sur ce compte google. Le dossier manexp_data sera entièrement remplacé par celui sélectionné."
    override val importInProgress = "Téléversement en cours, ne pas fermer la page..."
    override val folderReadError = "Impossible de lire le dossier sélectionné"
    override val notManexpFolder = "Le dossier sélectionné ne correspond pas à des données Manexp"
    override val uploadError = "Impossible de téléverser le dossier, veuillez réessayer plus tard."

    // Development
    override val devModeOff = "Mode développement désactivé"
    override val devModeOn = "Mode développement activé"
    override val featureInDevelopment = "Cette fonctionnalité est en développement. Elle est donc sujette à des bugs, changements ou suppressions."

    // Error Page
    override val errorOccurred = "Une erreur est survenue:"
    override val reconnect = "Se reconnecter"
    override val reloadApp = "Recharger l'application"

    // date
    override val date = "Date"

    // months
    override val january = "Janvier"
    override val february = "Février"
    override val march = "Mars"
    override val april = "Avril"
    override val may = "Mai"
    override val june = "Juin"
    override val july = "Juillet"
    override val august = "Août"
    override val september = "Septembre"
    override val october = "Octobre"
    override val november = "Novembre"
    override val december = "Décembre"

    // days
    override val monday = "Lundi"
    override val mon = "Lun."
    override val tuesday = "Mardi"
    override val tue = "Mar."
    override val wednesday = "Mercredi"
    override val wed = "Mer."
    override val thursday = "Jeudi"
    override val thu = "Jeu."
    override val friday = "Vendredi"
    override val fri = "Ven."
    override val saturday = "Samedi"
    override val sat = "Sam."
    override val sunday = "Dimanche"
    override val sun = "Dim."

    // incompatible browser
    override val incompatibleBrowserPWA = "Ce navigateur ne permet pas de télécharger l'application sur votre appareil. Il est conseillé d'utiliser un autre navigateur pour une expérience optimale."
    override val incompatibleBrowserDB = "Ce navigateur ne permet pas de gérer la base de données. Utilisez un autre navigateur."

    // installation
    override val installButton = "Installer l'application"
    override val connectButton = "Connecté à Google"
    override val connectionError = "La connexion à Google a échoué, veuillez réessayer."
    override val otherAccountError = "Le compte enregistré diffère du compte sélectionné. Veuillez sélectionner le bon compte."
    override val synchronizeButton = "Synchroniser"
    override val manualImportButton = "Importer des données"
    override val cannotInstall = "Utilisez un autre navigateur pour installer l'application."
    override val installed = "Application installée"

    // pages
    override val manexpPage = "Manexp"
    override val home = "Accueil"
    override val milking = "Traite"
    override val livestock = "Cheptel"
    override val outings = "Sorties"
    override val fields = "Champs"

    // Network
    override val noNetwork = "Pas de connection internet!"

    // Database
    override val updateSuccess = "Base de données mise à jour avec succès!"
    override val updateError = "Erreur de mise à jour de la base de données, veuillez réessayer."
    override val pictureStorageError = "Impossible d'enregistrer la photo."

    // Information panel
    override val settings = "Paramètres"
    override val about = "A propos"
    override val contact = "Contact"
    override val contactDev = "Manexp: Contacter le développeur"
    override val termsOfUse = "Conditions d'utilisation"
    override val bugReport = "Rapporter un bug"
    override val reportSubject = "Manexp: Rapporter un bug"
    override val reportBody = { version: String, build: String, device: DeviceInformation ->
        "Description du bug:\n(Exemple: Le calendrier des sorties crashe lorsque l'on accède au concepteur)\n\n\n" +
                "Étapes de reproductibilité:\n(Exemple:\n1. Ouvrir le calendrier des sorties\n2. Ouvrir le concepteur\n3. L'application crash)\n\n\n" +
                "Comportement attendu:\n(Exemple: L'application doit montrer les groupes à déplacer)\n\n\n" +
                "Context additionnel:\n(Exemple: Crashe seulement le matin)\n\n\n" +
                "Version: $version\nBuild: $build\nAppareil: $device"
    }
    override val newFeature = "Proposer une fonctionnalité"
    override val newFeatureSubject = "Manexp: Proposer une fonctionnalité"
    override val newFeatureBody = "Description de la nouvelle fonctionnalité:\n(Exemple: Créer un nouveau mode pour gérer les naissances et inséminations\n\n\n" +
            "Nom complet:\n\n\n" +
            "Numéro de téléphone:\n\n\n"
    override val debugger = "Console de débogage"

    // Necklace management
    override val necklace = { number: Int ->
        "Collier $number"
    }
    override val noLinkedNecklace = "Aucun collier lié."
    override val necklaceNotLinked = "Aucun animal lié ou animal incompatible"
    override val linkNecklace = "Liaison"
    override val selectNecklace = "Sélectionnez le collier à lier à l'animal"
    override val necklaceAlreadyAttributed = "Ce collier est déjà attribué."
    override val warningLinkedNecklaceTitle = "Collier lié"
    override val warningLinkedNecklaceMessage = "Cet animal est lié à un collier. Voulez vous vraiment le retirer? Si vous acceptez, le collier sera libre pour un autre animal."
    override val necklaceQuantity = "Nombre de colliers"
    override val necklaceNotAllowed = "Lier un animal à un collier est restreint aux animaux laitiers. Pour lier tout animal à un collier, allez dans les paramètres et changez votre préférence."

    // Device
    override val noDevice = "Aucun appareil trouvé"
    override val linkedDevices = "Appareils connectés"
    override val browser = "Navigateur"
    override val vendor = "Fabricant"
    override val model = "Modèle"
    override val type = "Type"
    override val platform = "Plateforme"
    override val lastSeen = "Dernière connection"
    override val unlinkDeviceTitle = "Supprimer l'appareil"
    override val unlinkDeviceMessage = "Êtes-vous sûr de vouloir supprimer cet appareil?"
    override val unlinkDeviceFailed = "Erreur de suppression de l'appareil"
    override val unlinkOwnDeviceTitle = "Supprimer cet appareil"
    override val unlinkOwnDeviceMessage = "Vous êtes sur le point de supprimer votre propre appareil, voulez-vous continuer?"


    // Version
    override val validity = "Validité"
    override val version = "Version"
    override val build = "Build"


    // confirm/cancel
    override val confirm = "Confirmer"
    override val cancel = "Annuler"
    override val clear = "Effacer"
    override val modify = "Modifier"

    // new version
    override val newVersion = "Nouvelle version installée"

    // terms
    override val terms = "/terms/terms_of_use_fr.html"

    // Test version
    override val trialFinished = "Période d'essai terminée"
    override val getPaidVersion = "Obtenir la version payante"
    override val getPaidSubject = "Demande de version payante"
    override val getPaidBody = "Merci d'utiliser Manexp! Pour accéder à la version payante, " +
            "veuillez remplir les informations ci-dessous et je vous recontacterai prochainement:" +
            "\n\nPrénom et nom:\nNuméro de téléphone:\nCanton de résidence:\nAdresse:\nActivité de votre exploitation:"
    override val unlimited = "Illimité"

    // General
    override val none = "Aucun/e"
    override val yes = "Oui"
    override val no = "Non"
    override val to = "à"
    override val legend = { period: String ->
        "Ecart de production par rapport à la moyenne des traites du $period des dix derniers jours"
    }
    override val noData = "Aucune donnée disponible"
    override val generatePDF = "Générer le PDF"
    override val loading = "Chargement..."

    // Synchronization
    override val synchronize = "Synchronisation avec Google Drive"
    override val askSynchronize = "Voulez-vous synchroniser avec Google Drive?"
    override val syncMessage = "Synchronisation avec Google Drive en cours, ne pas fermer la page..."
    override val databaseSynchronization = "Synchronisation de la base de données"
    override val picturesSynchronization = "Synchronisation des photos"
    override val syncSuccess = "Synchronisation avec Google Drive réussie!"
    override val syncError = "Erreur de synchronisation avec Google Drive, veuillez réessayer."

    // DB synchronization
    override val checkDBStatus = "Vérification de l'état de  la base de données..."
    override val checkDBStatusFinished = "Etat vérifié correctement. Synchronisation de la base de données en cours..."
    override val syncDBFinished = "Synchronisation de la base de données terminée avec succès!"
    override val downloadingDB = { table: String ->
        "Téléchargement de la table $table..."
    }
    override val downloadedDB = { table: String ->
        "Table $table téléchargée avec succès"
    }
    override val uploadingDB = { table: String ->
        "Téléversement de la table $table..."
    }
    override val uploadedDB = { table: String ->
        "Table $table téléversée avec succès"
    }
    override val syncingDB = { table: String ->
        "Synchronisation de la table $table..."
    }
    override val syncedDB = { table: String ->
        "Table $table synchronisée avec succès"
    }

    // Pic synchronization
    override val checkPicStatus = "Vérification de l'état des photos..."
    override val checkPicStatusFinished = "Etat correctement vérifié. Synchronisation des photos en cours..."
    override val syncPicFinished = "Synchronisation des photos terminée avec succès!"
    override val downloadingPic = { earTag: String ->
        "Téléchargement des photos de l'animal $earTag..."
    }
    override val downloadedPic = { earTag: String ->
        "Photos de l'animal $earTag correctement téléchargées"
    }
    override val uploadingPic = { earTag: String ->
        "Téléversement des photos de l'animal $earTag..."
    }
    override val uploadedPic = { earTag: String ->
        "Photos de l'animal $earTag correctement téléversées"
    }
    override val syncingPic = { earTag: String ->
        "Synchronisation des photos de l'animal $earTag..."
    }
    override val syncedPic = { earTag: String ->
        "Photos de l'animal $earTag correctement synchronisées"
    }

    // Settings
    override val settingsChooseModes = "Que voulez-vous gérer avec Manexp?"
    override val general = "Général"
    override val enableMasterPassword = "Activer le mot de passe maître. Ce mot de passe protège tous les paramètres administrateur de l'édition par des utilisateurs non autorisés. Il déverrouillera toutes les zones protégées par mot de passe de cette application."
    override val pdfRestricted = "Restreindre l'export de PDF. Ce paramètre protège la génération de PDF par mot de passe. Lorsqu'un utilisateur voudra générer un PDF dans un mode restreint il sera invité à entrer le mot de passe du mode ou le mot de passe maître."
    override val enablePassword = "Activer le mot de passe"
    override val password = "Mot de passe"
    override val loadSettings = "Chargement des paramètres..."
    override val invalidSettings = { errorMessage: String ->
        "Paramètres invalides: $errorMessage"
    }
    override val masterPasswordRequired = "Mot de passe maître requis"
    override val livestockPasswordRequired = "Mot de passe du cheptel requis"
    override val minimumOneNecklaceRequired = "Vous devez avoir au moins un collier"
    override val milkingPasswordRequired = "Mot de passe de la traite requis"
    override val minimumOneMilkingPositionRequired = "Vous devez avoir au moins une position de traite"
    override val outingsPasswordRequired = "Mot de passe des sorties requis"
    override val fieldsPasswordRequired = "Mot de passe des champs requis"
    override val noSettings = "Aucun paramètre trouvé"
    override val passwordValidity = "Sélectionnez la durée de déverrouillage en minutes après saisie du mot de passe. Cette valeur définira le temps où utilisateur pourra utiliser la zone restreinte déverrouillée sans se voir demander le mot de passe."
    override val atLeastOneMode = "Vous devez sélectionner au moin un mode."

    // Password
    override val noPassword = "Mot de passe vide"
    override val wrongPassword = "Mot de passe erroné"
    override val unlockMode = { mode: String, minutes: Int ->
        "Déverrouiller le mode $mode $minutes minutes"
    }
    override val admin = "Administrateur"

    // Camera
    override val flashNotSupported = "Flash non supporté"
    override val head = "Photo de la tête"
    override val rightSide = "Photo du côté droit"
    override val leftSide = "Photo du côté gauche"
    override val noPictures = "Aucune photo disponible."
    override val restrictMode = { mode: String ->
        "Restreindre le mode $mode avec un mot de passe. Cela restreindra l'édition et non la visualisation. Cela signifie que tous les utilisateurs pourront voir les informations, mais ne pourront pas les modifier sans mot de passe."
    }
    override val picturesDate = { date: String ->
        "Photos prises le $date"
    }
    override val warningDeleteTitle = "Confirmer la suppression"
    override val warningDeleteMessage = "Êtes-vous sûr de vouloir supprimer cet élément? Cette opération ne pourra pas être annulée."

    // Livestock
    override val addAnimal = "Commencez en ajoutant un animal"
    override val agateImport = "Importer les animaux depuis Agate"
    override val agateImportMessage = "Allez sur le site d'Agate, récupérez le fichier excel de votre cheptel et sélectionnez-le ci-dessous"
    override val agateImportInformation = "Seuls les animaux avec un nom valide et absents de Manexp vont être importés"
    override val importExcel = "Importer un fichier excel"
    override val validatePreview = "Avant de confirmer, contrôlez que les données sont associées à la bonne colonne et correctement formatées"
    override val notExcelFile = "La sélection n'est pas un fichier excel"
    override val invalidExcelFile = "Impossible d'importer les animaux depuis le fichier. Si l'erreur persiste, signalez un bug en joignant le fichier excel."
    override val profile = "Profil"
    override val necklaceNumber = "Numéro de collier"
    override val allAnimalsNecklaced = "Autoriser tous les animaux à avoir un collier. Ce paramètre définit si les mâles et juveniles peuvent également être associés à un collier."
    override val searchAnimal = "Trouver un animal"
    override val sortName = "Trier par nom"
    override val sortEarTag = "Trier par marque auriculaire"
    override val sortBirthDate = "Trier par date de naissance"
    override val sortNecklace = "Trier par collier"
    override val add = "Ajouter"
    override val earTag = "Marque auriculaire"
    override val name = "Nom"
    override val sex = "Sexe"
    override val arrivalDate = "Date d'arrivée"
    override val birthDate = "Date de naissance"
    override val selectSex = "Sélectionner le sexe"
    override val noEarTag = "Marque auriculaire absente ou non valide"
    override val noName = "Aucun nom saisi"
    override val noSex = "Aucun sexe sélectionné"
    override val noArrivalDate = "Aucune date d'arrivée sélectionnée"
    override val noBirthDate = "Aucune date de naissance sélectionnée"
    override val departureDate = "Date de départ"
    override val animalDeparted = "L'animal est marqué comme parti. Rajoutez-le pour effectuer des opérations sur lui."
    override val noDepartureDate = "Aucune date de départ sélectionnée"
    override val noAnimal = "Aucun animal sélectionné"

    // Dairy
    override val addDairies = "Ajoutez des productrices laitières avant de traire. Pour ce faire, allez dans votre cheptel et cliquez sur un animal que vous voulez traire. Vous serez guidé dans la création d'une productrice laitière."
    override val addAsDairy = "Ajouter cet animal à la liste des productrices laitières"
    override val animalIsValidDairy = "Cet animal remplit les conditions pour être une productrice laitière. Voulez-vous l'ajouter?"
    override val noBeginningProductionDate = "Aucune date de début de production sélectionnée"
    override val warningActiveDairyTitle = "Productrice laitière active"
    override val warningActiveDairyMessage = "Cet animal est une productrice laitière active. Voulez vous vraiment l'enlever? Si vous continuez, elle sera réformée."
    override val calvingDate = "Date de vêlage"
    override val noCalvingDate = "Aucune date de vêlage sélectionnée"
    override val dryDate = "Date de tarissement"
    override val noDryDate = "Aucune date de tarissement sélectionnée"
    override val dairyTriggerFailed = "Erreur de mise à jour des productrices laitières. Essayez de recharger la page. Si l'erreur persiste, soumettez un bug."

    // Lactations
    override val lactations = "Lactations"
    override val lactation = "lactation"
    override val lactationNumber = { number: Int ->
        "lactation $number"
    }
    override val beginningLactationDate = "Date de vêlage"
    override val endLactationDate: String = "Date de tarissement"
    override val noEndLactationDate: String = "Pas de date de tarissement"
    override val addCalving = "Inscrire un vêlage"
    override val addDried = "Inscrire un tarissement"

    // Treatment
    override val selectedNumber = {selected: Int, total: Int ->
        "Animaux sélectionnés: $selected/$total"
    }
    override val treatments = "Traitements"
    override val treatment = "Traitement"
    override val noTreatment = "Aucun traitement saisi"
    override val medicine = "Médicament"
    override val noMedicine = "Aucun médicament saisi"
    override val dosage = "Remise"
    override val noDosage = "Aucune remise saisie"
    override val beginningTreatmentDate = "Début du traitement"
    override val noBeginningTreatmentDate = "Aucun début de traitement sélectionné"
    override val endTreatmentDate = "Fin du traitement"
    override val noEndTreatmentDate = "Aucune fin de traitement sélectionnée"
    override val period = "Période"
    override val periodValue = { value: Int -> "$value jours" }
    override val milkReleaseDate = "Libération du lait"
    override val noMilkReleaseDate = "Aucune libération de lait sélectionnée"
    override val meatReleaseDate = "Libération de la viande"
    override val noMeatReleaseDate = "Aucune libération de viande sélectionnée"
    override val additionalInformation = "Informations supplémentaires"
    override val inProduction = "Gardée en production"
    override val keepInProduction = "Garder en production"
    override val rightFrontTeatTreated = "Trayon avant droit traité"
    override val rightFrontTeat = "Trayon avant droit"
    override val leftFrontTeatTreated = "Trayon avant gauche traité"
    override val leftFrontTeat = "Trayon avant gauche"
    override val rightRearTeatTreated = "Trayon arrière droit traité"
    override val rightRearTeat = "Trayon arrière droit"
    override val leftRearTeatTreated = "Trayon arrière gauche traité"
    override val leftRearTeat = "Trayon arrière gauche"
    override val invalidDate = "Date invalide"
    override val confirmRemoveTreatmentTitle = "Supprimer le traitement"
    override val confirmRemoveTreatmentMessage = "Êtes-vous sûr de vouloir supprimer ce traitement? Cette action ne peut pas être annulée."
    override val treatmentTriggerFailed = "Erreur de mise à jour des traitements. Essayez de recharger la page. Si l'erreur persiste, soumettez un bug."
    override val sickTitle = "Animal malade"
    override val sickNoProductionMessage = "Cet animal est malade et son lait est impropre à la consommation. Ne pas mettre en production."
    override val sickProductionMessage = "Trayons traités à ne pas mettre en production:"

    // Milking
    override val datedMilkProduction = { date: String ->
        "Production laitière du $date"
    }
    override val partOfDayMilkProduction = { partOfDay: String, value: String ->
        "Production laitière du ${partOfDay.lowercase()}: $value kg"
    }
    override val totalMilkProduction = { value: String ->
        "Production laitière totale: $value kg"
    }
    override val noMilkProduction = "Aucune production laitière disponible pour ce jour"
    override val dairyProfile = "Profil laitier"
    override val leftMilkingPositions = "Positions de traite gauche"
    override val rightMilkingPositions = "Positions de traite droite"
    override val beginningProductionDate = "Date de début de production"
    override val retirementDate = "Date de réforme"
    override val milkCycle = "Cycle de lactation"
    override val inactiveDairy = "Productrice laitière inactive"
    override val alreadySelected = "Productrice laitière déjà sélectionnée."
    override val alreadyMilkedTitle = "Animal déjà trait"
    override val alreadyMilkedMessage = "Voulez-vous naviguer vers la page des statistiques?"
    override val milkProductionError = "Impossible d'enregistrer une valeur. Vérifiez l'entrée. Si l'erreur persiste, signalez un bug."
    override val nothingToSave = "Aucune position n'est valide. Vérifiez que vous avez au moins une position contenant un animal et une valeur de production valide."
    override val selectMilkProductionDayTitle = "Générer le résumé de production laitière"
    override val selectMilkProductionDayEntry = "Sélectionnez le jour de production souhaité"
    override val noMilkProductionDate = "Aucune date de production sélectionnée"
    override val milkProductionPDF = { date: String ->
        "production_lait_$date.pdf"
    }
    override val mean = { partOfDay: String, value: String ->
        "Moyenne des 10 dernières traites du $partOfDay:\n $value kg"
    }
    override val deviation = { value: String ->
        "Ecart entre la moyenne et la valeur actuelle:\n $value%"
    }
    override val milkedValue = "Production actuelle (kg):"

    // Milk cycles
    override val production = "Production"
    override val dried = "Tarie"
    override val calving = "Vêlée"
    override val selectMilkCycle = "Sélectionnez un cycle de lactation"
    override val noMilkCycle = "Aucun cycle de lactation sélectionné"
    override val calvingTitle = "Fraîchement vêlée"
    override val calvingMessage = "Cet animal a fraîchement vêlé. Ne pas mettre son lait en production."

    // Countries
    override val switzerland = "Suisse"

    // Property status
    override val owner = "Propriétaire"
    override val lodger = "Locataire"
    override val other = "Autre"

    // Sex
    override val male = "Mâle"
    override val female = "Femelle"

    // parts of day
    override val morning = "Matin"
    override val evening = "Soir"
    override val total = "Total"
    override val totalProduction = "Général"
    override val kilograms = "kilogrammes"
    override val kg = "kg"
    override val beginning = "Début"
    override val end = "Fin"
    override val displayedProduction = { value: String ->
        "Production affichée: $value kg"
    }
    override val dayNumber = { value: Int ->
        "$value jours"
    }
    override val d305 = "Filtre 305 jours"

    // Outings
    override val courtyard = "Courette"
    override val courtyardLetter = "S"
    override val pasture = "Pâturage"
    override val pastureLetter = "P"
    override val badWeather = "Mauvais temps"
    override val badWeatherLetter = "M"
    override val notDefined = "Non défini"
    override val notDefinedLetter = "N"
    override val paused = "En pause"
    override val modifyGlobal = "Modifier globalement"
    override val modifyDay = { date: String ->
        "Modifier le $date"
    }
    override val outingsPDFTitle = { year: Int ->
        "Calendrier des sorties $year"
    }
    override val outingsPDFName = { year: Int ->
        "calendrier_sorties_$year.pdf"
    }

    // Outing groups
    override val addGroup = "Commencez en ajoutant des groupes de sortie"
    override val groupName = "Nom du groupe"
    override val cows = "Vaches"
    override val maxTenCharacters = "Le nom est limité à 10 caractères sans espaces"
    override val nameAlreadyExists = "Le nom existe déjà"

    // Fields
    override val searchFields = "Trouver des champs"
    override val sortSurface = "Trier par surface"
    override val sortProperty = "Trier par type de propriété"
    override val sortNumber = "Trier par numéro"
    override val sortID = "Trier par ID"
    override val sortMunicipality = "Trier par commune"
    override val sortCanton = "Trier par canton"
    override val fetchLandData = "Récupération des données de la parcelle..."
    override val zoomInFirst = "Zoomez avant de sélectionner une parcelle"
    override val noLandData = "Pas de données de parcelle trouvées. Si l'erreur persiste, contactez le développeur."
    override val importLand = "Importer cette parcelle?"
    override val landId = {id: String? ->
        if (id != null) {
            "Identifiant: $id"
        } else {
            "Identifiant"
        }
    }
    override val number = {number: String? ->
        if (number != null) {
            "Numéro: $number"
        } else  {
            "Numéro"
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
            "Commune: $municipality"
        } else {
            "Commune"
        }
    }
    override val municipalityNumber = {number: String? ->
        if (number != null) {
            "Numéro de commune: $number"
        } else {
            "Numéro de commune"
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
            "Pays: $country"
        } else {
            "Pays"
        }
    }
    override val landPDF = {link: String? ->
        if (link != null) {
            "PDF de la parcelle: $link"
        } else {
            "PDF de la parcelle"
        }
    }
    override val landLink = {link: String? ->
        if (link != null) {
            "Lien de la parcelle: $link"
        } else {
            "Lien de la parcelle"
        }
    }
    override val cadastreAddress = {address: String? ->
        if (address != null) {
            "Adresse du cadastre: $address"
        } else {
            "Adresse du cadastre"
        }
    }
    override val cadastrePostalCode = {code: String? ->
        if (code != null) {
            "Code postal du cadastre: $code"
        } else {
            "Code postal du cadastre"
        }
    }
    override val cadastreMunicipality = {municipality: String? ->
        if (municipality != null) {
            "Commune du cadastre: $municipality"
        } else {
            "Commune du cadastre"
        }
    }
    override val cadastreEmail = {email: String? ->
        if (email != null) {
            "Email du cadastre: $email"
        } else {
            "Email du cadastre"
        }
    }
    override val cadastrePhone = {phone: String? ->
        if (phone != null) {
            "Téléphone du cadastre: $phone"
        } else {
            "Téléphone du cadastre"
        }
    }
    override val cadastreLink = {link: String? ->
        if (link != null) {
            "Site du cadastre: $link"
        } else {
            "Site du cadastre"
        }
    }
    override val propertyStatus = { status: String? ->
        if (status != null) {
            "Statut de propriété: $status"
        } else {
            "Statut de propriété"
        }
    }
    override val landName = "Nom de la parcelle"
    override val land = "Parcelle"
    override val cadastre = "Cadastre"
    override val selectProperty = "Sélectionnez un statut"
    override val invalidLandData = "Remplissez tous les champs requis avant d'enregistrer cette parcelle."

    // Location
    override val noLocation = "Localisation en attente, indisponible ou ou accès refusé"

    // unknown
    override val unknown = "Inconnu"

    // migration1
    override val Migration1ErrorNoContent = "❌ Erreur de récupération de l'ancienne structure, aucun contenu. ❌"
    override val Migration1ErrorMalformedEntry = "❌ Entrée malformée ignorée, merci de contacter le développeur pour la corriger. ❌"
    override val Migration1MigrateMilkProductionTitle = "Migration de la production laitière"
    override val Migration1MigrateMilkProductionStart = "Début de la migration de la production laitière..."
    override val Migration1MigrateMilkProductionStatus = { actualValue: Int, totalValue: Int ->
        "Migration de l'animal $actualValue/$totalValue..."
    }
    override val Migration1MigrateMilkProductionSuccess = "✅ Migration de la production laitière réussie ✅"

}