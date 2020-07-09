object SecondTask {
  def main(args: Array[String]): Unit = {
    val simpleP = TreeNode(1, None, None)
    val simpleQ = TreeNode(1, None, None)
    assert(isSameTree(Some(simpleP), Some(simpleQ)))
    val p = TreeNode(1, Some(TreeNode(2, None, None)), None)
    val q = TreeNode(1, None, Some(TreeNode(2, None, None)))
    assert(!isSameTree(Some(p), Some(q)))
  }

  def isSameTree[X](p: Option[TreeNode[X]], q: Option[TreeNode[X]]): Boolean = {
    (p, q) match {
      case (Some(a), Some(b)) =>
        a.value == b.value && isSameTree(a.left, b.left) && isSameTree(a.right, b.right)
      case (None, None) => true
      case _ => false
    }
  }

  case class TreeNode[X](value: X, left: Option[TreeNode[X]], right: Option[TreeNode[X]])
}
