package com.github.mattisonchao

import com.github.mattisonchao.entity.toEndPoint
import com.github.mattisonchao.node.NodeImpl
import com.github.mattisonchao.node.NodeManager
import com.github.mattisonchao.option.NodeOptions
import com.github.mattisonchao.option.StorageOptions

fun main() {
    val manager = NodeManager.getInstance()
    manager.addAddress("127.0.0.1:8886".toEndPoint)
    manager.addAddress("127.0.0.1:8887".toEndPoint)
    val node = NodeImpl.create("127.0.0.1", 8888).withStorageOptions(StorageOptions(logEntriesPath = "./logEntries-8888")).withNodeOptions(NodeOptions(NodeController()))
    node.startup()
}