package com.pokegoapi.go;

import com.github.aeonlucid.pogoprotos.networking.Requests;
import com.google.protobuf.Message;
import com.pokegoapi.go.spec.Credentials;
import com.pokegoapi.network.spec.ServerRequest;

/**
 * Created by chris on 1/23/2017.
 */
public abstract class PokemonGoClientSpi {

    public abstract void engineLogin(Credentials credentials);

    public abstract ServerRequest engineCreateRequest(Message request, Requests.RequestType type);
}
