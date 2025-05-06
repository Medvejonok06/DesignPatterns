import com.google.gson.Gson;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ApiService_Factory implements Factory<ApiService> {
  private final Provider<Gson> gsonProvider;

  public ApiService_Factory(Provider<Gson> gsonProvider) {
    this.gsonProvider = gsonProvider;
  }

  @Override
  public ApiService get() {
    return newInstance(gsonProvider.get());
  }

  public static ApiService_Factory create(Provider<Gson> gsonProvider) {
    return new ApiService_Factory(gsonProvider);
  }

  public static ApiService newInstance(Gson gson) {
    return new ApiService(gson);
  }
}
