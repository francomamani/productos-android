package servicios;

import java.util.List;

import modelos.Producto;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface ProductoService {
    @Headers("Content-Type: application/json")
    @GET("productos")
    Call <List<Producto>> listar();

    @Headers("Content-Type: application/json")
    @GET("productos/{idproducto")
    Call <Producto > mostrar(@Path("idproducto") Integer idproducto);

    @Headers("Content-Type: application/json")
    @POST("productos")
    Call<Producto> crear(@Body Producto producto);

    @Headers("Content-Type: application/json")
    @PUT("productos/{idproducto}")
    Call<Producto> actualizar(@Path("idproducto") Integer idproducto, @Body Producto producto);

    @Headers("Content-Type: application/json")
    @DELETE("productos/{idproducto")
    Call <Producto> eliminar(@Path("idproducto") Integer idproducto);

}
