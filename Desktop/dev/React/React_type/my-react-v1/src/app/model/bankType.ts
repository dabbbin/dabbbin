// let data = {
//     name:'회계(會計)',
//     category:'Accounting',
//     FP:{
//       asset :'총자산',
//       liability:'부채',
//       equity:'자본'
//     },
//     IS:{
//       revenue:'수익',
//       expense:'비용'
//     },
//     Assets:[{name:'cash',element:'quickAssets'}, {naem:'ordinaryDeposit',element:'quickAssets'}]      
//   } 

import { StringValueToken } from "html2canvas/dist/types/css/syntax/tokenizer";

//타입을 만드는 방식(2) :  type , interface 
 
export type BankType = {
    name:string; 
    category:string;
    FP: FP;
    IS: {
        revenue:Number;
        expense:Number;
    },
    Assets:Assets[] 
     
}

//2. 타입의 타입 만들기 

export type FP = {
    asset:Number;
    liability:Number;
    equity:Number;
}

export type Assets = {
    name:string;
    element:string;
}