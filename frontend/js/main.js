/*
 * TechStore Solutions — frontend/js/main.js
 * Utilitários compartilhados: carrinho, toast, formatação.
 * Comunica com os controllers PHP via fetch().
 */

/* ── CARRINHO ── */

function obterCarrinho() {
  return JSON.parse(localStorage.getItem('ts_carrinho') || '[]');
}

function salvarCarrinho(c) {
  localStorage.setItem('ts_carrinho', JSON.stringify(c));
  atualizarBadge();
}

function adicionarAoCarrinho(produto) {
  var c   = obterCarrinho();
  var idx = c.findIndex(function(i) { return i.id == produto.id; });
  if (idx >= 0) {
    c[idx].quantidade++;
  } else {
    produto.quantidade = 1;
    c.push(produto);
  }
  salvarCarrinho(c);
  toast('Adicionado ao carrinho! 🛒', 'ok');
}

function atualizarBadge() {
  var b = document.getElementById('badge-carrinho');
  if (!b) return;
  var n = obterCarrinho().reduce(function(s, i) { return s + i.quantidade; }, 0);
  b.textContent  = n;
  b.style.display = n > 0 ? 'flex' : 'none';
}

/* ── TOAST ── */

function toast(msg, tipo) {
  var wrap = document.getElementById('toast-wrap');
  if (!wrap) return;
  var el = document.createElement('div');
  el.className = 'toast ' + (tipo || 'ok');
  el.innerHTML = '<span>' + (tipo === 'err' ? '❌' : '✅') + '</span> ' + msg;
  wrap.appendChild(el);
  setTimeout(function() {
    el.style.transition = 'opacity .3s, transform .3s';
    el.style.opacity    = '0';
    el.style.transform  = 'translateX(110%)';
    setTimeout(function() { el.remove(); }, 320);
  }, 2800);
}

/* ── FORMATAÇÃO ── */

function fmtPreco(v) {
  return 'R$ ' + parseFloat(v).toFixed(2).replace('.', ',');
}

/* ── INICIALIZAÇÃO ── */

document.addEventListener('DOMContentLoaded', function() {
  atualizarBadge();

  /* Busca no header → redireciona para produtos.html?busca= */
  var formB = document.getElementById('form-busca');
  if (formB) {
    formB.addEventListener('submit', function(e) {
      e.preventDefault();
      var t = document.getElementById('input-busca').value.trim();
      if (t) window.location.href = 'produtos.html?busca=' + encodeURIComponent(t);
    });
  }
});
