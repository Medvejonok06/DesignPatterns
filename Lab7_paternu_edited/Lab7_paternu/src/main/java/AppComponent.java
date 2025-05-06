import dagger.Component;
import javax.inject.Singleton;

@Singleton //Вказує, що всі залежності, надані цим компонентом, будуть сінглтонами
@Component(modules = NetworkModule.class)
//Оголошуємо компонент Dagger і вказуємо, що залежності беруться з модуля NetworkModule
public interface AppComponent {

    ApiService getApiService();
    //Метод для отримання інстансу ApiService з побудованого графа залежностей
}
