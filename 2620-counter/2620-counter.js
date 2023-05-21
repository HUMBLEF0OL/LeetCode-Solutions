/**
 * @param {number} n
 * @return {Function} counter
 */
let createCounter = (n) =>{
    inc = 0;
    return(()=>{
        return n++;
    })
}

/** 
 * const counter = createCounter(10)
 * counter() // 10
 * counter() // 11
 * counter() // 12
 */
