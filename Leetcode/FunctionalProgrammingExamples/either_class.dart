class Either<L,R>{
  final L? _left;
  final R? _right;
  Either._(this._left,this._right);

  //factory constructor
  factory Either.left(L left)=>Either._(left,null);
  factory Either.right(R right)=>Either._(null,right);

  bool isLeft()=> _left!=null;
  bool isRight()=> _right!=null;

  //getter for left
  L get left {
      if(_left==null){
          throw StateError("called left on right");
      }
      return _left;
  }

  //getter for rigt
  R get right {
      if(_right==null){
          throw("called right on left");
      }
      return _right;
  }


}