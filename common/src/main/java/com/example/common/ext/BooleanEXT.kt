package com.example.common.ext


 fun Boolean.yes(block:()->Unit){
    if (this){
        block()
    }
}