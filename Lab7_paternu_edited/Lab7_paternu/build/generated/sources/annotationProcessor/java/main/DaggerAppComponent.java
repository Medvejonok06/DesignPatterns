import com.google.gson.Gson;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerAppComponent {
  private DaggerAppComponent() {
  }

  public static Builder builder() {
    return new Builder();
  }

  public static AppComponent create() {
    return new Builder().build();
  }

  public static final class Builder {
    private NetworkModule networkModule;

    private Builder() {
    }

    public Builder networkModule(NetworkModule networkModule) {
      this.networkModule = Preconditions.checkNotNull(networkModule);
      return this;
    }

    public AppComponent build() {
      if (networkModule == null) {
        this.networkModule = new NetworkModule();
      }
      return new AppComponentImpl(networkModule);
    }
  }

  private static final class AppComponentImpl implements AppComponent {
    private final AppComponentImpl appComponentImpl = this;

    private Provider<Gson> provideGsonProvider;

    private AppComponentImpl(NetworkModule networkModuleParam) {

      initialize(networkModuleParam);

    }

    @SuppressWarnings("unchecked")
    private void initialize(final NetworkModule networkModuleParam) {
      this.provideGsonProvider = DoubleCheck.provider(NetworkModule_ProvideGsonFactory.create(networkModuleParam));
    }

    @Override
    public ApiService getApiService() {
      return new ApiService(provideGsonProvider.get());
    }
  }
}
