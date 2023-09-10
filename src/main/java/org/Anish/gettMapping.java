package org.Anish;

import org.springframework.web.bind.annotation.*;

@RestController

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

}
