/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloWorld.model;

import java.util.ArrayList;
import java.util.List;

public class HardCodedPostHandler implements PostDataHandler {

  @Override
  public List<Posts> getFavoritePosts() {
    List<Posts> post = new ArrayList<Posts>();

    post.add(new Posts("FUN", "F is for friends who do stuff together, U is for you and me, N is for anytime and anywhere at all down here in the deep blue sea", "June 24th", "aclenz"));


    return post;
  }
}