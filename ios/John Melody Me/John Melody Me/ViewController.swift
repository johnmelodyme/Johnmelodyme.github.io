//
//  ViewController.swift
//  John Melody Me
//
//  Created by John Melody on 26/05/2020.
//  Copyright © 2020 John Melody. All rights reserved.
//

import UIKit
import WebKit

class ViewController: UIViewController, WKNavigationDelegate {

    @IBOutlet var _resume: WKWebView!
    
    override func viewDidLoad() {
        super.viewDidLoad()
        let _url = URL(string: "https://johnmelodyme.github.io")
        _resume.load(URLRequest(url: _url))
    }
    
    func loadWebView() {
        _resume = WKWebView()
        _resume.navigationDelegate = self
        view = _resume
    }
    
}
