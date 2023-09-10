package org.Anish;

import org.springframework.web.bind.annotation.*;

@RestController  //it is a Combination of @Controller and @ResponseBody.
                // @RestController annotation is used for Mapping the RESTFUL WEB SERVICES.


  /*   WHAT IS WEB SERVICES ??
  WEB Services is a System of Software that allowing different Machines to Interact with each other Over Internet/Network.

   */

public class gettMapping {

    @GetMapping("dukhi/attma/Anish") //it will shows on Browser as well as PostMan
      public String getCity() {
          return "Jharkhand";
      }

      @PutMapping("Anish/dukhi/Attma")  //it is only seen in POSTMAN
      public String getName(){
        return "I love You Mummy";
      }

      @PatchMapping("Anish/plays")
      public String getHobby(){
        return "Love to play VolleyBall";
      }

       @DeleteMapping("Anish/delete")
       public String getDelete() {
           return  "Anish is deleted";
       }
}
