import dagger.Module; //Анотація @Module вказує Dagger, що цей клас є модулем і надає залежності
import dagger.Provides; //Анотація @Provides позначає метод, який створює залежність
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import javax.inject.Singleton; //Анотація @Singleton позначає, що залежність має бути однаковою у всьому графі

@Module
public class NetworkModule {

    //Метод, який створює і надає екземпляр Gson
    @Provides
    @Singleton //Один і той самий об’єкт буде використовуватися всюди, де потрібен Gson
    public Gson provideGson() {
        return new GsonBuilder()
                .setPrettyPrinting() //Форматований вивід JSON
                .serializeNulls()
                .create(); //Створюємо Gson з налаштувань GSON_BUILDER
    }
}
