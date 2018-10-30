package com.itscoder.ljuns.practise.retrofit;

import android.support.annotation.Nullable;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.List;
import okhttp3.internal.platform.Platform;
import retrofit2.Call;

/**
 * @author ljuns
 * Created at 2018/10/29.
 */
public class RetrofitProxy implements GitHubService {

    InvocationHandler mInvocationHandler = new InvocationHandler() {
        private final Platform platform = Platform.get();

        @Override public Object invoke(Object proxy, Method method, @Nullable Object[] args)
            throws Throwable {
            //// If the method is a method from Object then defer to normal invocation.
            //if (method.getDeclaringClass() == Object.class) {
            //    return method.invoke(this, args);
            //}
            //if (platform.isDefaultMethod(method)) {
            //    return platform.invokeDefaultMethod(method, service, proxy, args);
            //}
            //ServiceMethod<Object, Object> serviceMethod =
            //    (ServiceMethod<Object, Object>) loadServiceMethod(method);
            //OkHttpCall<Object> okHttpCall = new OkHttpCall<>(serviceMethod, args);
            //return serviceMethod.adapt(okHttpCall);
            return null;
        }
    };

    @Override
    public Call<List<Repo>> listRepos(String user) {
        try {
            Method method = RetrofitProxy.class.getMethod("listRepos", String.class);
            return (Call<List<Repo>>) mInvocationHandler.invoke(this, method, null);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return null;
    }
}
