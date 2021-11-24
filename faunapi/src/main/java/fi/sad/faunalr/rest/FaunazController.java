package fi.sad.faunalr.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import fi.faunalr.faunasvc.*;

/**
 * If bare connection is not ok service will fail to start
 */
@RestController
public class FaunazController {

    /* curl http://localhost:8471/sample-api/1.0/id/10 */
    @RequestMapping("sample-api/1.0/id/{id}")
    public ResponseEntity<?> findById(@PathVariable int id){
        String responseText = "Requested data for id: " +  id;

        return new ResponseEntity<>(responseText, HttpStatus.OK);

        //return new ResponseEntity<>( HttpStatus.NOT_FOUND);
    }

    /* curl http://localhost:8471/sample-api/1.0/info */
    @RequestMapping("sample-api/1.0/info")
    public ResponseEntity<?> infoService(){
        return new ResponseEntity<>("Sample API service 1.0", HttpStatus.OK);
    }

    /* curl http://localhost:8471/sample-api/1.0/svc */
    @RequestMapping("sample-api/1.0/svc")
    public ResponseEntity<?> serviceStatus (){

        String value = FaunaService.instance().getServiceInfo();

        return new ResponseEntity<>("Fauna Service status: " + value, HttpStatus.OK);
    }


}
