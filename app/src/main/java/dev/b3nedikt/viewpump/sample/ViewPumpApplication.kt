package dev.b3nedikt.viewpump.sample

import android.app.Application
import com.useinsider.insider.Insider
import dev.b3nedikt.app_locale.AppLocale
import dev.b3nedikt.app_locale.SharedPrefsAppLocaleRepository
import dev.b3nedikt.viewpump.ViewPump

/**
 * For ViewPump.
 */
class ViewPumpApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        AppLocale.appLocaleRepository = SharedPrefsAppLocaleRepository(this)

        ViewPump.init(TextUpdatingInterceptor(), CustomTextViewInterceptor())

        Insider.Instance.init(this, "PARTNER_NAME")
        Insider.Instance.setGDPRConsent(true)
        Insider.Instance.enableCarrierCollection(true)
        Insider.Instance.enableIpCollection(true)
        Insider.Instance.enableLocationCollection(true)

    }
}