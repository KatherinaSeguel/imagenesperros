package com.example.imagenesperros

import androidx.test.ext.truth.app.NotificationActionSubject.assertThat
import com.example.imagenesperros.model.ApiInterface
import junit.framework.Assert.assertNotNull
import kotlinx.coroutines.runBlocking
import okhttp3.mockwebserver.MockResponse
import okhttp3.mockwebserver.MockWebServer
import org.hamcrest.core.Is.`is`
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import java.io.File
import java.nio.file.Path

@RunWith(JUnit4::class)
class NetworkTest {
private  lateinit var  service : ApiInterface
    private lateinit var  mokWedServer: MockWebServer

    @Before
    fun setUp(){
        mokWedServer= MockWebServer()
        //porque voy a testear mi api fictica
        service= Retrofit.Builder()
            .baseUrl(mokWedServer.url(""))
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiInterface::class.java)
    }

    //método para matar el servicio

    @After
    fun shutDown(){
        mokWedServer.shutdown()
    }

    @Test
    fun resquestBreedList(){
        runBlocking {
            enqueResponse("api-response.json")
            val resultResponse =service.getDataFromApi()  //aquí va un método
            val resquest= mokWedServer.takeRequest().body

            assertNotNull(resultResponse)

            assertThat(resquest.path,`is` ("breeds/list"))
        }
    }


    private fun enqueResponse(filename:String,headers: Map<String, String> = emptyMap()){
        val sources = getJson(filename)
        val mockResponser= MockResponse()

        //si tuvieramos headers
        for ((key,value) in headers){
         // mockResponser.addleader(key,value)
        }

       mokWedServer.enqueue(mockResponser.setBody(sources))
    }

    private fun getJson(path: String): String{
        val url= javaClass.classLoader!!.getResource(path)
        val file= File(url.path)
        return String(file.readBytes())
    }

}