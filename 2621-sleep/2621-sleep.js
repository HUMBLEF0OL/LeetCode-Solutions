/**
 * @param {number} millis
 */
async function sleep(millis) {
    return new Promise((resolve) =>{
        setTimeout(resolve,millis);
    })
}

/** 
 * let t = Date.now()
 * sleep(100).then(() => console.log(Date.now() - t)) // 100
 */

/*
async function sleep(milliseconds) {
	await new Promise(res => setTimeout(res, milliseconds)); 
}
*/