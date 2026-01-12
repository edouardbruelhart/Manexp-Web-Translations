package resources.strings

import kotlinx.browser.window
import resources.strings.de.StringsDe
import resources.strings.en.StringsEn
import resources.strings.fr.StringsFr
import resources.strings.it.StringsIt

object Localization {
    val currentStrings: Strings by lazy {
        when (window.navigator.language.substring(0, 2)) {
            "fr" -> StringsFr
            "de" -> StringsDe
            "it" -> StringsIt
            else -> StringsEn
        }
    }
}